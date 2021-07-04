package car;

import org.junit.jupiter.api.Test;
import strategy.MoveStrategy;
import strategy.RandomMoveStrategy;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    void findWinnerTest() {
        // given
        Car car1 = new Car("car1", 5);
        Car car2 = new Car("car2", 3);
        Car car3 = new Car("car3", 2);
        List<Car> original = Arrays.asList(car1, car2, car3);
        Cars cars = new Cars(original);

        // when
        List<Car> winners = cars.findWinner(5);

        // then
        assertThat(winners).extracting("carName")
                .containsExactly(new CarName("car1"));

    }

    @Test
    void moveCarTest() {
        // given
        Car car = new Car("car1");
        MoveStrategy moveStrategy = new RandomMoveStrategy();

        // when
        car.move(() -> true);

        // then
        assertThat(car.isPositionSame(1)).isTrue();
    }

    @Test
    void divideCarsTest() {
        // given & when
        Cars cars = new Cars("car1,car2,car3");

        // then
        assertThat(cars.getCars())
                .containsExactly(
                        new Car("car1"),
                        new Car("car2"),
                        new Car("car3"));
    }

    @Test
    void validateCarNameTest() {
        // then
        assertThatThrownBy(() -> {
                // given & when
                new CarName("");
            }
        ).isInstanceOf(IllegalArgumentException.class);
    }
}
