
public class Note {

    private int pitch;
    private int duration;
    private int velocity;

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
