package car;

public class Position {
    private int position;

    public Position(int position) {
        this.position = position;
    }

    public void move() {
        this.position++;
    }

    public boolean isSame(int position) {
        return this.position == position;
    }
}
