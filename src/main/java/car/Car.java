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
        this(carName, new Position(0));
    }

    public Car(String carName, int position) {
        this(new CarName(carName), new Position(position));
    }

    public Car(CarName carName, Position position) {
        this.carName = carName;
        this.position = position;
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
        print();
    }

    private void print() {
        System.out.print(carName.getName() + " : ");
        System.out.println(this.position.getMarker());
    }

    public boolean isPositionSame(int position) {
        return this.position.isSame(position);
    }

    public String getCarName() {
        return this.carName.getName();
    }
}
