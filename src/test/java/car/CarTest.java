package car;

import org.junit.jupiter.api.Test;
import strategy.MoveStrategy;
import strategy.RandomMoveStrategy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

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
