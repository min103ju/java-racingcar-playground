package car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final String SEPARATORS = ",";
    private final List<Car> cars;

    public Cars(String cars) {
        this.cars = Arrays.stream(cars.split(SEPARATORS))
                .map(carsName -> new Car(carsName))
                .collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
