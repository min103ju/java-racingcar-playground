package racing;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarGame {
    private final String carNames;
    private final List<Car> cars;

    private final String REGEX = ",";

    public CarGame(String carNames) {
        this.carNames = carNames;
        this.cars = generateCars(0);
    }

    public CarGame(String carNames, int position) {
        this.carNames = carNames;
        this.cars = generateCars(position);
    }

    public List<Car> generateCars(int position) {
        return Arrays.stream(this.carNames.split(REGEX))
                .map(name -> new CarName(name))
                .map(carName -> new Car(carName, new Position(position)))
                .collect(Collectors.toList());
    }

    public List<Car> getWinners(int winnerPosition) {
        return this.cars.stream()
                .filter(car -> car.isWinner(winnerPosition))
                .collect(Collectors.toList());
    }
}
