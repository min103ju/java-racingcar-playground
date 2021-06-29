package racing;

public class Car {

    private final int MOVE_CONDITION_NUM = 4;

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
        if (randomValue >= MOVE_CONDITION_NUM) {
            this.position.move();
        }
    }

    public Position getPosition() {
        return this.position;
    }

    public String getCarName() {
        return carName.getName();
    }

    public boolean isWinner(int winnerPosition) {
        return this.position.isSame(winnerPosition);
    }

    public void print() {
        System.out.println(carName.getName() + ": " + position.getPositionMarker());
    }
}
