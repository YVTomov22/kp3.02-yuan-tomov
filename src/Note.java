// Представлява една музикална нота с тон, продължителност и сила на звука
public class Note {

    private int pitch;      // MIDI pitch (0-127), 0 = пауза
    private int duration;   // продължителност в тикове
    private int velocity;   // сила на звука (0-127)

    public Note(int pitch, int duration, int velocity) {
        this.pitch = pitch;
        this.duration = duration;
        this.velocity = velocity;
    }

    public Note(int pitch, int duration) {
        this(pitch, duration, 64);
    }

    public int getPitch() {
        return pitch;
    }

    public int getDuration() {
        return duration;
    }

    public int getVelocity() {
        return velocity;
    }

    @Override
    public String toString() {
        return "Note[pitch=" + pitch + ", dur=" + duration + ", vel=" + velocity + "]";
    }
}
