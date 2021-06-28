package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarGameTest {

    @DisplayName("자동차 이름 쉼표 기준으로 분리 테스트")
    @Test
    void splitCar() {
        // given
        CarGame carGame = new CarGame("car1,car2,car3");

        // when
        List<Car> cars = carGame.initCars();

        // then
        assertThat(cars.size()).isEqualTo(3);
    }
}
