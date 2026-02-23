import java.util.ArrayList;
import java.util.List;

// Нотна партитура на първата част на "Лунна соната" от Бетховен
// Adagio sostenuto в C# минор, Op. 27 No. 2
public class MoonlightSonata {

    // Продължителности (в тикове, 480 = четвъртинка)
    private static final int Q = 480;        // четвъртинка
    private static final int H = Q * 2;      // половинка
    private static final int W = Q * 4;      // цяла нота
    private static final int T = Q / 3;      // триола
    private static final int DH = H + Q;     // половинка с точка

    // MIDI pitch стойности за нотите
    private static final int Gs2 = 44, A2 = 45, B2 = 47;
    private static final int Cs3 = 49, E3 = 52, Fs3 = 54;
    private static final int Fs4 = 66, Gs4 = 68, A4 = 69, B4 = 71;
    private static final int Cs5 = 73, Ds5 = 75, E5 = 76;

    // Нива на силата на звука
    private static final int PP = 35;     // много тихо (триоли)
    private static final int P = 45;      // тихо (мелодия)
    private static final int MP = 55;     // средно тихо
    private static final int BASS_V = 50; // бас

    // Триолни арпежи – характерният акомпанимент на сонатата
    public static List<Note> createTripletArpeggios() {
        List<Note> notes = new ArrayList<>();

        // Такт 1-2: C# минор
        for (int i = 0; i < 8; i++) {
            addTriplet(notes, Gs4, Cs5, E5, PP);
        }

        // Такт 3: C# минор (с мелодия отгоре)
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);

        // Такт 4: A мажор
        addTriplet(notes, A4, Cs5, E5, PP);
        addTriplet(notes, A4, Cs5, E5, PP);
        addTriplet(notes, A4, Cs5, E5, PP);
        addTriplet(notes, A4, Cs5, E5, PP);

        // Такт 5: C# минор
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);

        // Такт 6: доминанта (G#-B-D#)
        addTriplet(notes, Gs4, B4, Ds5, PP);
        addTriplet(notes, Gs4, B4, Ds5, PP);
        addTriplet(notes, Gs4, B4, Ds5, PP);
        addTriplet(notes, Gs4, B4, Ds5, PP);

        // Такт 7: A мажор
        addTriplet(notes, A4, Cs5, E5, PP);
        addTriplet(notes, A4, Cs5, E5, PP);
        addTriplet(notes, A4, Cs5, E5, PP);
        addTriplet(notes, A4, Cs5, E5, PP);

        // Такт 8: F# минор
        addTriplet(notes, Fs4, A4, Cs5, PP);
        addTriplet(notes, Fs4, A4, Cs5, PP);
        addTriplet(notes, Fs4, A4, Cs5, PP);
        addTriplet(notes, Fs4, A4, Cs5, PP);

        // Такт 9: C# минор
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);
        addTriplet(notes, Gs4, Cs5, E5, PP);

        // Такт 10: G# (доминанта)
        addTriplet(notes, Gs4, B4, E5, PP);
        addTriplet(notes, Gs4, B4, E5, PP);
        addTriplet(notes, Gs4, B4, E5, PP);
        addTriplet(notes, Gs4, B4, E5, PP);

        // Такт 11-12: C# минор
        for (int i = 0; i < 8; i++) {
            addTriplet(notes, Gs4, Cs5, E5, PP);
        }

        // Такт 13: B доминанта
        addTriplet(notes, Gs4, B4, Ds5, PP);
        addTriplet(notes, Gs4, B4, Ds5, PP);
        addTriplet(notes, Gs4, B4, Ds5, PP);
        addTriplet(notes, Gs4, B4, Ds5, PP);

        // Такт 14: E мажор
        addTriplet(notes, Gs4, B4, E5, PP);
        addTriplet(notes, Gs4, B4, E5, PP);
        addTriplet(notes, Gs4, B4, E5, PP);
        addTriplet(notes, Gs4, B4, E5, PP);

        // Такт 15-16: завръщане в C# минор
        for (int i = 0; i < 8; i++) {
            addTriplet(notes, Gs4, Cs5, E5, PP);
        }

        return notes;
    }

    // Мелодична линия (горен глас)
    public static List<Note> createMelody() {
        List<Note> notes = new ArrayList<>();

        // Такт 1-2: пауза (само триоли звучат)
        notes.add(new Note(0, W, 0));
        notes.add(new Note(0, W, 0));

        // Такт 3: мелодията започва
        notes.add(new Note(Gs4, DH, P));
        notes.add(new Note(A4, Q, P));

        // Такт 4
        notes.add(new Note(Gs4, H, P));
        notes.add(new Note(0, H, 0));

        // Такт 5
        notes.add(new Note(E5, H, P));
        notes.add(new Note(Ds5, Q, P));
        notes.add(new Note(E5, Q, P));

        // Такт 6
        notes.add(new Note(Ds5, W, P));

        // Такт 7
        notes.add(new Note(E5, H, P));
        notes.add(new Note(Cs5, H, P));

        // Такт 8
        notes.add(new Note(A4, W, P));

        // Такт 9
        notes.add(new Note(Gs4, W, P));

        // Такт 10
        notes.add(new Note(Gs4, H, P));
        notes.add(new Note(B4, H, P));

        // Такт 11
        notes.add(new Note(Cs5, W, P));

        // Такт 12
        notes.add(new Note(B4, H, P));
        notes.add(new Note(Cs5, H, P));

        // Такт 13
        notes.add(new Note(Ds5, W, P));

        // Такт 14
        notes.add(new Note(E5, W, P));

        // Такт 15-16: заключение
        notes.add(new Note(Cs5, W, MP));
        notes.add(new Note(Cs5, W, PP));

        return notes;
    }

    // Басова линия (лява ръка)
    public static List<Note> createBassLine() {
        List<Note> notes = new ArrayList<>();

        notes.add(new Note(Cs3, W, BASS_V));  // такт 1
        notes.add(new Note(Cs3, W, BASS_V));  // такт 2
        notes.add(new Note(Cs3, W, BASS_V));  // такт 3
        notes.add(new Note(A2, W, BASS_V));   // такт 4
        notes.add(new Note(E3, H, BASS_V));   // такт 5
        notes.add(new Note(Cs3, H, BASS_V));
        notes.add(new Note(B2, W, BASS_V));   // такт 6
        notes.add(new Note(A2, W, BASS_V));   // такт 7
        notes.add(new Note(Fs3, W, BASS_V));  // такт 8
        notes.add(new Note(Cs3, W, BASS_V));  // такт 9
        notes.add(new Note(Gs2, W, BASS_V));  // такт 10
        notes.add(new Note(Cs3, W, BASS_V));  // такт 11
        notes.add(new Note(Cs3, W, BASS_V));  // такт 12
        notes.add(new Note(B2, W, BASS_V));   // такт 13
        notes.add(new Note(E3, W, BASS_V));   // такт 14
        notes.add(new Note(Cs3, W, BASS_V));  // такт 15
        notes.add(new Note(Cs3, W, BASS_V));  // такт 16

        return notes;
    }

    // Връща цялата партитура: триоли + мелодия + бас
    public static List<List<Note>> getFullScore() {
        List<List<Note>> score = new ArrayList<>();
        score.add(createTripletArpeggios());
        score.add(createMelody());
        score.add(createBassLine());
        return score;
    }

    // Добавя група от 3 триолни ноти
    private static void addTriplet(List<Note> notes, int p1, int p2, int p3, int vel) {
        notes.add(new Note(p1, T, vel));
        notes.add(new Note(p2, T, vel));
        notes.add(new Note(p3, T, vel));
    }

    // Създава низходяща секвенция от ноти
    public static List<Note> createDescendingSequence(int startPitch, int interval, int count, int duration, int velocity) {
        List<Note> notes = new ArrayList<>();
        int pitch = startPitch;
        for (int i = 0; i < count; i++) {
            notes.add(new Note(pitch, duration, velocity));
            pitch += interval;
        }
        return notes;
    }

    // Създава възходяща секвенция от ноти
    public static List<Note> createAscendingSequence(int startPitch, int interval, int count, int duration, int velocity) {
        return createDescendingSequence(startPitch, Math.abs(interval), count, duration, velocity);
    }
}
