package car;

import strategy.MoveStrategy;

import java.util.Objects;

public class Car {
    private final CarName carName;
    private Position position;

    public Car(String carName) {
        this(new CarName(carName));
    }

    public Car(CarName carName) {
        this.carName = carName;
        this.position = new Position(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carName, car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.movable()) {
            this.position.move();
        }
    }

    public boolean isPositionSame(int position) {
        return this.position.isSame(position);
    }
}
