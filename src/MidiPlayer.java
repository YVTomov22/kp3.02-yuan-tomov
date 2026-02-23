import javax.sound.midi.*;
import java.util.List;

// Клас за създаване и възпроизвеждане на MIDI секвенции
public class MidiPlayer {

    private static final int RESOLUTION = 480; // тикове на четвъртинка
    private static final int INSTRUMENT = 0;   // пиано

    private Sequencer sequencer;
    private Sequence sequence;

    public MidiPlayer() {
        try {
            sequencer = MidiSystem.getSequencer();
        } catch (MidiUnavailableException e) {
            System.out.println("Грешка: не може да се отвори MIDI sequencer");
            e.printStackTrace();
        }
    }

    // Създава MIDI секвенция от няколко гласа (траки)
    public void createMultiTrackSequence(List<List<Note>> tracks) {
        try {
            sequence = new Sequence(Sequence.PPQ, RESOLUTION);

            for (int i = 0; i < tracks.size(); i++) {
                Track track = sequence.createTrack();

                // задаване на инструмент – пиано за всички канали
                ShortMessage prog = new ShortMessage();
                prog.setMessage(ShortMessage.PROGRAM_CHANGE, i, INSTRUMENT, 0);
                track.add(new MidiEvent(prog, 0));

                // темпо само в първия трак (54 BPM за Adagio sostenuto)
                if (i == 0) {
                    int microsPerBeat = 60_000_000 / 54;
                    byte[] tempoData = {
                        (byte) ((microsPerBeat >> 16) & 0xFF),
                        (byte) ((microsPerBeat >> 8) & 0xFF),
                        (byte) (microsPerBeat & 0xFF)
                    };
                    MetaMessage tempo = new MetaMessage();
                    tempo.setMessage(0x51, tempoData, 3);
                    track.add(new MidiEvent(tempo, 0));
                }

                // включване на sustain педала
                ShortMessage sustain = new ShortMessage();
                sustain.setMessage(ShortMessage.CONTROL_CHANGE, i, 64, 127);
                track.add(new MidiEvent(sustain, 0));

                // добавяне на нотите една след друга
                long tick = 0;
                for (Note note : tracks.get(i)) {
                    if (note.getPitch() > 0) {
                        ShortMessage on = new ShortMessage();
                        on.setMessage(ShortMessage.NOTE_ON, i, note.getPitch(), note.getVelocity());
                        track.add(new MidiEvent(on, tick));

                        ShortMessage off = new ShortMessage();
                        off.setMessage(ShortMessage.NOTE_OFF, i, note.getPitch(), 0);
                        track.add(new MidiEvent(off, tick + note.getDuration()));
                    }
                    tick += note.getDuration();
                }
            }

        } catch (InvalidMidiDataException e) {
            System.out.println("Грешка при създаване на секвенцията");
            e.printStackTrace();
        }
    }

    // Пуска музиката
    public void play() {
        if (sequence == null) {
            System.out.println("Няма заредена секвенция!");
            return;
        }
        try {
            if (!sequencer.isOpen()) {
                sequencer.open();
            }
            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(54);
            sequencer.start();
        } catch (Exception e) {
            System.out.println("Грешка при възпроизвеждане");
            e.printStackTrace();
        }
    }

    // Спира музиката
    public void stop() {
        if (sequencer != null && sequencer.isRunning()) {
            sequencer.stop();
        }
    }

    // Проверява дали свири в момента
    public boolean isPlaying() {
        return sequencer != null && sequencer.isRunning();
    }

    // Затваря ресурсите
    public void close() {
        if (sequencer != null && sequencer.isOpen()) {
            sequencer.stop();
            sequencer.close();
        }
    }
}
