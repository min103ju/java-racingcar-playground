import racingCar.Car;
import racingCar.CarsGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        CarsGame carsGame = new CarsGame();

        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.");
        String carsNames = scanner.nextLine();
        System.out.println("시도할 횟수는 몇회인가요?");
        int count = scanner.nextInt();

        List<Car> cars = carsGame.divideCar(carsNames);
        List<Car> winners = new ArrayList<>();

        while (winners.isEmpty()) {
            cars.stream()
                    .forEach(car -> {
                        carsGame.checkMoveCar(car);
                        System.out.println(car.getName() + ": " + car.getPosition());
                    });

            winners = cars.stream()
                    .filter(car -> carsGame.checkComplete(car, count))
                    .collect(Collectors.toList());

        }

        String winnersName = winners.stream()
                .map(car -> car.getName())
                .collect(Collectors.joining(","));

        System.out.println(winnersName + "가 최종 우승했습니다.");

    }
}
