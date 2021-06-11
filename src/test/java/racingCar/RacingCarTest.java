package racingCarTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class RacingCarTest {
    @Test
    void validateNameLength() {
        // then
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            // when
            // given
            Car car = new Car("Lamborghini");
        }).withMessageMatching("자동차 이름은 5자를 넘길 수 없습니다.")
    }
}
