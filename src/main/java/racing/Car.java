package racing;

public class Car {
    private final Position position;
    private final CarName carName;

    public Car(CarName carName) {
        this.carName = carName;
        this.position = new Position(0);
    }

    public void move(int randomValue) {
        if (randomValue >= 4) {
            this.position.move();
        }
    }

    public Position getPosition() {
        return this.position;
    }
}
