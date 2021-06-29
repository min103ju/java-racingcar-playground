package racing;

public class Position {
    private int position;
    private String positionMarker = "";

    public Position(int position) {
        this.position = position;
    }

    public void move() {
        this.position++;
        positionMarker += "-";
    }

    public int getPosition() {
        return this.position;
    }

    public boolean isSame(int winnerPosition) {
        return this.position == winnerPosition;
    }

    public String getPositionMarker() {
        return this.positionMarker;
    }
}
