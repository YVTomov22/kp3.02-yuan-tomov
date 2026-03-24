import java.util.ArrayList;
import java.util.List;

public class MoonlightSonata {

    private static final int Q  = 480;
    private static final int H  = Q * 2;
    private static final int W  = Q * 4;
    private static final int E8 = Q / 2;
    private static final int T  = Q / 3;
    private static final int DH = H + Q;
    private static final int DQ = Q + E8;
    private static final int S  = Q / 4;

    private static final int Cs1 = 25, Ds1 = 27, E1 = 28, Fs1 = 30, Gs1 = 32;
    private static final int A1 = 33, B1 = 35;
    private static final int Cs2 = 37, Ds2 = 39, E2 = 40, Fs2 = 42, Gs2 = 44, A2 = 45, Bs2 = 48, B2 = 47;
    private static final int Cs3 = 49, D3 = 50, Ds3 = 51, E3 = 52, Fs3 = 54, G3 = 55, Gs3 = 56, A3 = 57, Bs3 = 60, B3 = 59;
    private static final int C4 = 60, Cs4 = 61, D4 = 62, Ds4 = 63, E4 = 64, F4 = 65, Fs4 = 66, G4 = 67, Gs4 = 68, A4 = 69, Bb4 = 70, B4 = 71;
    private static final int C5 = 72, Cs5 = 73, D5 = 74, Ds5 = 75, E5 = 76, F5 = 77, Fs5 = 78, G5 = 79, Gs5 = 80, A5 = 81, B5 = 83;
    private static final int C6 = 84, Cs6 = 85;

    private static final int PPP = 25;
    private static final int PP  = 35;
    private static final int P   = 45;
    private static final int MP  = 55;
    private static final int MF  = 65;
    private static final int F   = 80;

    private static final int BPP  = 40;
    private static final int BP   = 50;
    private static final int BMP  = 58;
    private static final int BMF  = 68;

    public static List<Note> createTripletArpeggios() {
        List<Note> n = new ArrayList<>();

        trip(n, Gs4, Cs5, E5, PP, 20);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, A4, Cs5, E5, PP, 2);
        trip(n, A4, D5, Fs5, PP, 2);

        trip(n, Gs4, C5, Ds5, PP, 4);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, A4, Cs5, Fs5, PP, 4);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, B4, E5, Gs5, PP, 4);

        trip(n, Fs4, B4, Ds5, PP, 4);

        trip(n, B4, E5, Gs5, PP, 4);

        trip(n, Fs4, A4, Ds5, PP, 4);

        trip(n, Gs4, B4, E5, PP, 4);

        trip(n, Gs4, B4, E5, PP, 4);

        trip(n, A4, Cs5, E5, PP, 4);

        trip(n, Fs4, A4, Cs5, PP, 2);
        trip(n, Gs4, B4, E5, PP, 2);

        trip(n, Gs4, Cs5, E5, MP, 4);

        trip(n, Gs4, C5, E5, MP, 2);
        trip(n, Gs4, C5, E5, MF, 2);

        trip(n, Gs4, Cs5, E5, MP, 4);

        trip(n, Gs4, Cs5, E5, MP, 2);
        trip(n, A4, Cs5, E5, MP, 2);

        trip(n, Gs4, Cs5, E5, P, 4);

        trip(n, Gs4, Cs5, E5, P, 4);

        trip(n, Gs4, Cs5, E5, P, 4);

        trip(n, Gs4, Cs5, E5, P, 4);

        trip(n, A4, Cs5, E5, P, 4);

        trip(n, A4, D5, Fs5, P, 4);

        trip(n, Gs4, C5, E5, P, 4);

        trip(n, Gs4, Cs5, E5, P, 4);

        trip(n, A4, Cs5, Fs5, P, 4);

        trip(n, Gs4, Cs5, E5, MP, 4);

        trip(n, Gs4, Cs5, E5, P, 4);
        trip(n, Gs4, B4, E5, P, 2);
        trip(n, Gs4, B4, D5, PP, 2);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, A4, Cs5, E5, PP, 2);
        trip(n, A4, Cs5, E5, P, 2);

        trip(n, Gs4, B4, Ds5, P, 4);

        trip(n, A4, Cs5, E5, P, 4);

        trip(n, A4, Cs5, E5, P, 4);

        trip(n, Gs4, B4, E5, P, 4);

        trip(n, Gs4, B4, E5, P, 4);

        trip(n, A4, C5, E5, P, 4);

        trip(n, A4, Cs5, E5, P, 4);

        trip(n, Gs4, Cs5, E5, P, 4);

        trip(n, Gs4, Cs5, E5, P, 4);

        trip(n, Gs4, Cs5, E5, MP, 4);

        trip(n, A4, Cs5, E5, MP, 4);

        trip(n, Gs4, C5, E5, P, 4);

        trip(n, Gs4, Cs5, E5, P, 4);

        trip(n, Gs4, Cs5, E5, P, 4);

        trip(n, Gs4, Cs5, E5, P, 4);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, Gs4, Cs5, E5, PP, 4);

        trip(n, Gs4, Cs5, E5, PP, 4);

        n.add(new Note(0, W, 0));

        n.add(new Note(0, H, 0));
        trip(n, Gs4, Cs5, E5, PPP, 2);

        n.add(new Note(0, W, 0));

        return n;
    }

    public static List<Note> createMelody() {
        List<Note> n = new ArrayList<>();

        rest(n, W * 4);

        n.add(new Note(Gs4, DH, P));
        n.add(new Note(A4, Q, P));

        n.add(new Note(B4, H, P));
        n.add(new Note(A4, Q, P));
        n.add(new Note(Gs4, Q, P));

        n.add(new Note(A4, W, P));

        n.add(new Note(Gs4, W, PP));

        rest(n, W * 2);

        rest(n, W * 2);

        n.add(new Note(E5, DH, P));
        n.add(new Note(Ds5, Q, P));

        n.add(new Note(E5, H, P));
        rest(n, H);

        n.add(new Note(Gs5, DH, P));
        n.add(new Note(Fs5, Q, P));

        n.add(new Note(E5, W, P));

        n.add(new Note(Ds5, DH, P));
        n.add(new Note(Cs5, Q, P));

        n.add(new Note(B4, W, P));

        n.add(new Note(Cs5, DH, P));
        n.add(new Note(Ds5, Q, P));

        n.add(new Note(E5, W, P));

        n.add(new Note(E5, DH, P));
        n.add(new Note(Ds5, Q, P));

        n.add(new Note(Cs5, W, P));

        n.add(new Note(B4, H, P));
        n.add(new Note(Cs5, H, P));

        n.add(new Note(Ds5, DH, MP));
        n.add(new Note(Cs5, Q, MP));

        n.add(new Note(Ds5, H, MP));
        n.add(new Note(E5, H, MF));

        n.add(new Note(Ds5, DH, MP));
        n.add(new Note(Cs5, Q, P));

        n.add(new Note(B4, H, P));
        rest(n, Q);
        n.add(new Note(Cs5, Q, P));

        n.add(new Note(Ds5, DQ, P));
        n.add(new Note(Cs5, E8, P));
        n.add(new Note(B4, H, P));

        n.add(new Note(Cs5, DQ, P));
        n.add(new Note(B4, E8, P));
        n.add(new Note(A4, H, P));

        n.add(new Note(B4, DQ, P));
        n.add(new Note(A4, E8, P));
        n.add(new Note(Gs4, H, P));

        n.add(new Note(A4, DQ, P));
        n.add(new Note(Gs4, E8, P));
        n.add(new Note(Fs4, H, P));

        n.add(new Note(Gs4, DQ, P));
        n.add(new Note(Fs4, E8, P));
        n.add(new Note(E4, H, P));

        rest(n, H);
        n.add(new Note(E5, H, P));

        n.add(new Note(Ds5, DH, P));
        n.add(new Note(Cs5, Q, P));

        n.add(new Note(B4, W, P));

        n.add(new Note(A4, W, P));

        n.add(new Note(Gs4, DH, P));
        n.add(new Note(A4, Q, P));

        n.add(new Note(Gs4, W, P));

        n.add(new Note(Gs4, DH, MP));
        rest(n, Q);

        n.add(new Note(Fs4, W, P));

        n.add(new Note(E4, H, P));
        n.add(new Note(D4, H, PP));

        n.add(new Note(Gs4, DH, PP));
        n.add(new Note(A4, Q, PP));

        n.add(new Note(B4, DH, PP));
        n.add(new Note(A4, Q, PP));

        n.add(new Note(Gs4, W, PP));

        n.add(new Note(Gs4, DH, PP));
        n.add(new Note(A4, Q, PP));

        n.add(new Note(B4, H, PP));
        n.add(new Note(A4, Q, PP));
        n.add(new Note(Gs4, Q, PP));

        n.add(new Note(A4, DH, PP));
        rest(n, Q);

        n.add(new Note(E5, H, P));
        n.add(new Note(Ds5, Q, P));
        n.add(new Note(E5, Q, P));

        n.add(new Note(Ds5, W, P));

        n.add(new Note(E5, H, P));
        n.add(new Note(Cs5, H, P));

        n.add(new Note(A4, W, P));

        n.add(new Note(Gs4, W, P));

        n.add(new Note(Gs4, H, P));
        n.add(new Note(B4, H, P));

        n.add(new Note(C5, DH, P));
        n.add(new Note(B4, Q, P));

        n.add(new Note(A4, H, P));
        n.add(new Note(Gs4, H, P));

        n.add(new Note(Gs4, DH, P));
        rest(n, Q);

        n.add(new Note(E5, H, P));
        n.add(new Note(Ds5, Q, P));
        n.add(new Note(E5, Q, P));

        n.add(new Note(E5, H, MP));
        n.add(new Note(Cs5, H, MP));

        n.add(new Note(B4, H, P));
        n.add(new Note(A4, H, P));

        n.add(new Note(Gs4, W, PP));

        n.add(new Note(E5, H, PP));
        n.add(new Note(Ds5, Q, PP));
        n.add(new Note(E5, Q, PP));

        n.add(new Note(Fs5, H, PP));
        n.add(new Note(E5, H, PP));

        n.add(new Note(Ds5, DH, PP));
        rest(n, Q);

        n.add(new Note(E5, H, PP));
        rest(n, H);

        n.add(new Note(Ds5, DQ, PP));
        n.add(new Note(E5, E8, PP));
        rest(n, H);

        n.add(new Note(Cs5, W, PP));

        rest(n, W);

        n.add(new Note(E5, H, PPP));
        n.add(new Note(Cs5, H, PPP));

        n.add(new Note(E5, W + H, PPP));

        return n;
    }

    public static List<Note> createBassLine() {
        List<Note> n = new ArrayList<>();

        n.add(new Note(Cs2, W, BP));
        n.add(new Note(Cs2, W, BP));
        n.add(new Note(Cs3, W, BP));
        n.add(new Note(Cs3, W, BP));
        n.add(new Note(Cs3, W, BP));

        n.add(new Note(B2, W, BP));

        n.add(new Note(A2, W, BP));

        n.add(new Note(Fs2, H, BP));
        n.add(new Note(D3, H, BP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(Fs2, H, BP));
        n.add(new Note(D3, H, BP));

        n.add(new Note(Gs2, W, BP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(Fs2, W, BP));

        n.add(new Note(Gs2, H, BP));
        n.add(new Note(Cs3, H, BP));

        n.add(new Note(E2, W, BP));

        n.add(new Note(B1, W, BP));

        n.add(new Note(E2, W, BP));

        n.add(new Note(B1, W, BP));

        n.add(new Note(E2, W, BP));

        n.add(new Note(E2, W, BP));

        n.add(new Note(A1, W, BP));

        n.add(new Note(Fs2, H, BP));
        n.add(new Note(E2, H, BP));

        n.add(new Note(Cs3, W, BMP));

        n.add(new Note(Gs2, W, BMP));

        n.add(new Note(Cs3, W, BMP));

        n.add(new Note(A2, H, BP));
        n.add(new Note(Gs2, H, BP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(A2, W, BP));

        n.add(new Note(D3, H, BP));
        n.add(new Note(Fs2, H, BP));

        n.add(new Note(Gs2, W, BP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(Fs2, W, BP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(Gs2, W, BMP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(Gs2, H, BP));
        n.add(new Note(B2, H, BPP));

        n.add(new Note(Cs2, W, BPP));

        n.add(new Note(Cs2, W, BPP));

        n.add(new Note(Gs2, H, BPP));
        n.add(new Note(Cs3, H, BPP));

        n.add(new Note(Cs3, W, BPP));

        n.add(new Note(B2, W, BPP));

        n.add(new Note(A2, W, BPP));

        n.add(new Note(Fs2, H, BPP));
        n.add(new Note(D3, H, BP));

        n.add(new Note(Gs2, W, BP));

        n.add(new Note(A2, W, BP));

        n.add(new Note(Fs2, W, BP));

        n.add(new Note(E2, W, BP));

        n.add(new Note(E2, W, BP));

        n.add(new Note(A2, W, BP));

        n.add(new Note(Fs2, H, BP));
        n.add(new Note(D3, H, BP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(Cs3, W, BP));

        n.add(new Note(A2, W, BPP));

        n.add(new Note(Gs2, W, BPP));

        n.add(new Note(Cs3, W, BPP));

        n.add(new Note(Cs3, W, BPP));

        n.add(new Note(Gs2, W, BPP));

        n.add(new Note(Cs3, W, BPP));

        rest(n, W);

        n.add(new Note(Cs2, H, PPP));
        n.add(new Note(Cs3, H, PPP));

        n.add(new Note(Cs2, W + H, PPP));

        return n;
    }

    public static List<List<Note>> getFullScore() {
        List<List<Note>> score = new ArrayList<>();
        score.add(createTripletArpeggios());
        score.add(createMelody());
        score.add(createBassLine());
        return score;
    }

    private static void trip(List<Note> notes, int p1, int p2, int p3, int vel, int count) {
        for (int i = 0; i < count; i++) {
            notes.add(new Note(p1, T, vel));
            notes.add(new Note(p2, T, vel));
            notes.add(new Note(p3, T, vel));
        }
    }

    private static void rest(List<Note> notes, int totalDuration) {
        notes.add(new Note(0, totalDuration, 0));
    }
}
