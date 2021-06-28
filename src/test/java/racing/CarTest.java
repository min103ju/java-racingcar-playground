package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @DisplayName("자동차 완주 검증 테스트")
    @Test
    void isWinnerTest() {
        // given
        int winnerPosition = 3;
        Car car = new Car(new CarName("car"), new Position(3));

        // when
        boolean actual = car.isWinner(winnerPosition);

        // then
        assertThat(actual).isTrue();
    }

    @DisplayName("자동차 전진 테스트")
    @Test
    void moveCarTest() {
        // given
        Car car = new Car(new CarName("car"));

        // when
        car.move(4);

        // then
        assertThat(car.getPosition().getPosition()).isEqualTo(1);
    }

    @DisplayName("자동차 이름 검증 성공 케이스")
    @Test
    void validateCarName() {
        // given
        CarName carName = new CarName("car");

        // when
        boolean actual = carName.isValidate();

        // then
        assertThat(actual).isTrue();
    }

    @DisplayName("자동차 이름 검증 실패 케이스")
    @Test
    void validateCarNameFailCase() {
        // given
        CarName carName = new CarName("");

        // then
        assertThatThrownBy(() -> {
            // when
            boolean actual = carName.isValidate();
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
