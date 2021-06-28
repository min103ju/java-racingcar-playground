package racingCar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarsGame {

    private final String SEPARATOR = ",";
    private final int MOVE_CONDITION = 4;

    public List<Car> divideCar(String carsNames) {
        return Arrays.stream(carsNames.split(SEPARATOR))
                .map(carName -> new Car(carName))
                .collect(Collectors.toList());
    }

    public void checkMoveCar(Car car) {
        if (car.getRandomValue() >= MOVE_CONDITION) {
            car.move();
        }
    }

    public boolean checkComplete(Car car, int completeCount) {
        return car.getPosition() == completeCount;
    }

}
