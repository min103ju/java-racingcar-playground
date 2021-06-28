package racing;

public class Car {
    private final CarName carName;
    private final Position position;

    public Car(CarName carName) {
        this.carName = carName;
        this.position = new Position(0);
    }

    public Car(CarName carName, Position position) {
        this.carName = carName;
        this.position = position;
    }

    public void move(int randomValue) {
        if (randomValue >= 4) {
            this.position.move();
        }
    }

    public Position getPosition() {
        return this.position;
    }

    public boolean isWinner(int winnerPosition) {
        return this.position.isSame(winnerPosition);
    }
}
