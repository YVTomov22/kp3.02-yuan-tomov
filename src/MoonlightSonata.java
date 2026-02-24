import java.util.ArrayList;
import java.util.List;

public class MoonlightSonata {


    private static final int Q = 480;
    private static final int H = Q * 2;
    private static final int W = Q * 4;
    private static final int T = Q / 3;
    private static final int DH = H + Q;

    private static final int Gs2 = 44, A2 = 45, B2 = 47;
    private static final int Cs3 = 49, E3 = 52, Fs3 = 54;
    private static final int Fs4 = 66, Gs4 = 68, A4 = 69, B4 = 71;
    private static final int Cs5 = 73, Ds5 = 75, E5 = 76;

    private static final int PP = 35;
    private static final int P = 45;
    private static final int MP = 55;
    private static final int BASS_V = 50;

    public static List<Note> createTripletArpeggios() {
        List<Note> notes = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            addTriplet(notes, Gs4, Cs5, E5, PP);
        }

        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);

        addTriplet(notes, A4, Cs5, E5, PP);
        addTriplet(notes, A4, Cs5, E5, PP);
        addTriplet(notes, A4, Cs5, E5, PP);
        addTriplet(notes, A4, Cs5, E5, PP);

        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);

        addTriplet(notes, Gs4, B4, Ds5, PP);
        addTriplet(notes, Gs4, B4, Ds5, PP);
        addTriplet(notes, Gs4, B4, Ds5, PP);
        addTriplet(notes, Gs4, B4, Ds5, PP);

        addTriplet(notes, A4, Cs5, E5, PP);
        addTriplet(notes, A4, Cs5, E5, PP);
        addTriplet(notes, A4, Cs5, E5, PP);
        addTriplet(notes, A4, Cs5, E5, PP);

        addTriplet(notes, Fs4, A4, Cs5, PP);
        addTriplet(notes, Fs4, A4, Cs5, PP);
        addTriplet(notes, Fs4, A4, Cs5, PP);
        addTriplet(notes, Fs4, A4, Cs5, PP);

        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);

        addTriplet(notes, Gs4, B4, E5, PP);
        addTriplet(notes, Gs4, B4, E5, PP);
        addTriplet(notes, Gs4, B4, E5, PP);
        addTriplet(notes, Gs4, B4, E5, PP);

        for (int i = 0; i < 8; i++) {
            addTriplet(notes, Gs4, Cs5, E5, PP);
        }

        addTriplet(notes, Gs4, B4, Ds5, PP);
        addTriplet(notes, Gs4, B4, Ds5, PP);
        addTriplet(notes, Gs4, B4, Ds5, PP);
        addTriplet(notes, Gs4, B4, Ds5, PP);

        addTriplet(notes, Gs4, B4, E5, PP);
        addTriplet(notes, Gs4, B4, E5, PP);
        addTriplet(notes, Gs4, B4, E5, PP);
        addTriplet(notes, Gs4, B4, E5, PP);

        for (int i = 0; i < 8; i++) {
            addTriplet(notes, Gs4, Cs5, E5, PP);
        }

        return notes;
    }

    public static List<Note> createMelody() {
        List<Note> notes = new ArrayList<>();

        notes.add(new Note(0, W, 0));
        notes.add(new Note(0, W, 0));

        notes.add(new Note(Gs4, DH, P));
        notes.add(new Note(A4, Q, P));

        notes.add(new Note(Gs4, H, P));
        notes.add(new Note(0, H, 0));

        notes.add(new Note(E5, H, P));
        notes.add(new Note(Ds5, Q, P));
        notes.add(new Note(E5, Q, P));

        notes.add(new Note(Ds5, W, P));

        notes.add(new Note(E5, H, P));
        notes.add(new Note(Cs5, H, P));

        notes.add(new Note(A4, W, P));

        notes.add(new Note(Gs4, W, P));

        notes.add(new Note(Gs4, H, P));
        notes.add(new Note(B4, H, P));

        notes.add(new Note(Cs5, W, P));

        notes.add(new Note(B4, H, P));
        notes.add(new Note(Cs5, H, P));

        notes.add(new Note(Ds5, W, P));

        notes.add(new Note(E5, W, P));

        notes.add(new Note(Cs5, W, MP));
        notes.add(new Note(Cs5, W, PP));

        return notes;
    }

    public static List<Note> createBassLine() {
        List<Note> notes = new ArrayList<>();

        notes.add(new Note(Cs3, W, BASS_V));
        notes.add(new Note(Cs3, W, BASS_V));
        notes.add(new Note(Cs3, W, BASS_V));
        notes.add(new Note(A2, W, BASS_V));
        notes.add(new Note(E3, H, BASS_V));
        notes.add(new Note(Cs3, H, BASS_V));
        notes.add(new Note(B2, W, BASS_V));
        notes.add(new Note(A2, W, BASS_V));
        notes.add(new Note(Fs3, W, BASS_V));
        notes.add(new Note(Cs3, W, BASS_V));
        notes.add(new Note(Gs2, W, BASS_V));
        notes.add(new Note(Cs3, W, BASS_V));
        notes.add(new Note(Cs3, W, BASS_V));
        notes.add(new Note(B2, W, BASS_V));
        notes.add(new Note(E3, W, BASS_V));
        notes.add(new Note(Cs3, W, BASS_V));
        notes.add(new Note(Cs3, W, BASS_V));

        return notes;
    }

    public static List<List<Note>> getFullScore() {
        List<List<Note>> score = new ArrayList<>();
        score.add(createTripletArpeggios());
        score.add(createMelody());
        score.add(createBassLine());
        return score;
    }

    private static void addTriplet(List<Note> notes, int p1, int p2, int p3, int vel) {
        notes.add(new Note(p1, T, vel));
        notes.add(new Note(p2, T, vel));
        notes.add(new Note(p3, T, vel));
    }

    public static List<Note> createDescendingSequence(int startPitch, int interval, int count, int duration, int velocity) {
        List<Note> notes = new ArrayList<>();
        int pitch = startPitch;
        for (int i = 0; i < count; i++) {
            notes.add(new Note(pitch, duration, velocity));
            pitch += interval;
        }
        return notes;
    }

    public static List<Note> createAscendingSequence(int startPitch, int interval, int count, int duration, int velocity) {
        return createDescendingSequence(startPitch, Math.abs(interval), count, duration, velocity);
    }
}
