package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

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
