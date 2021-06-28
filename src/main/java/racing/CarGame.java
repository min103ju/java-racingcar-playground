package racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarGame {
    private final String carNames;

    public CarGame(String carNames) {
        this.carNames = carNames;
    }

    public List<Car> initCars() {
        return Arrays.stream(this.carNames.split(","))
                .map(name -> new CarName(name))
                .map(carName -> new Car(carName))
                .collect(Collectors.toList());
    }
}
