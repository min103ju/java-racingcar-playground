package car;

public class Position {
    private final String MARKER = "-";

    private int position;
    private String marker;

    public Position(int position) {
        this.position = position;
        this.marker = "";
    }

    public void move() {
        this.position++;
        this.marker += MARKER;
    }

    public boolean isSame(int position) {
        return this.position == position;
    }

    public String getMarker() {
        return this.marker;
    }
}
