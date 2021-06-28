package racing;

public class Position {
    private int position;

    public Position(int position) {
        this.position = position;
    }

    public void move() {
        this.position++;
    }

    public int getPosition() {
        return this.position;
    }
}
