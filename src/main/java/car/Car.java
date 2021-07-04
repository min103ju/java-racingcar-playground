package car;

import java.util.Objects;

public class Car {
    private final CarName carName;

    public Car(String carName) {
        this(new CarName(carName));
    }

    public Car(CarName carName) {
        this.carName = carName;
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
}
