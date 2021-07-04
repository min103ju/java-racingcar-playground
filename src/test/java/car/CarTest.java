package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    void divideCars() {
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
    void validateCarName() {
        // then
        assertThatThrownBy(() -> {
                // given & when
                new CarName("");
            }
        ).isInstanceOf(IllegalArgumentException.class);
    }
}
