package racingCar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class RacingCarTest {

    CarsGame carsGame;

    @BeforeEach
    void setUp() {
        carsGame = new CarsGame();
    }

    @Test
    void checkComplete() {
        // given
        Car car = new Car("benz");
        int completeCount = 3;

        // when
        boolean check = carsGame.checkComplete(car, completeCount);

        // then
        assertThat(check).isFalse();
    }

    @Test
    void checkMoveCar() {
        // given
        Car car = new Car("benz");

        // when
        carsGame.checkMoveCar(car);

        // then
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void divideCarName() {
        // given
        String carsNames = "audi,kia,benz";

        // when
        List<Car> cars = carsGame.divideCar(carsNames);

        // then
        assertThat(cars.size()).isEqualTo(3);
    }

    @Test
    void validateNameLength() {
        // then
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            // when
            // given
            Car car = new Car("Lamborghini");
        }).withMessageMatching("자동차 이름은 5자를 넘길 수 없습니다.");
    }
}
