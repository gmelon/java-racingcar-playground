package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class CarTest {

    /**
     * CarName Test
     */
    @Test
    void carName_기본생성() {
        String carName = "hyun";
        CarName carNameObj = new CarName(carName);

        assertThat(carNameObj.getValue()).isEqualTo(carName);
    }

    @Test
    void carName은_5자리를_초과할수업다() {
        String carName = "sanghyeok";

        assertThatThrownBy(() -> new CarName(carName))
            .isInstanceOf(IllegalArgumentException.class);
    }

    /**
     * Position Test
     */
    @Test
    void position_생성_후_전진() {
        CarPosition carPosition = new CarPosition();
        carPosition.stepForward();

        assertThat(carPosition.getValue()).isEqualTo(1);
    }

    /**
     * Car Tet
     */
    @Test
    void car_기본생성() {
        String carName = "hyun";
        Car car = new Car(carName);
        assertThat(car.getName().getValue()).isEqualTo(carName);
        assertThat(car.getPosition().getValue()).isEqualTo(0);
    }

    @Test
    void car_차이름은_5자리를_초과할수없다() {
        String carName = "sangHyeok";
        assertThatThrownBy(() -> new Car(carName))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void play_랜덤숫자가_4이상이면_전진한다() {
        //given
        int randomNumber = 4;
        Car car = new Car("car1");
        //when
        PlayStatus playStatus = car.play(randomNumber);
        //then
        assertThat(playStatus.getCarPositionValue()).isEqualTo(1);
    }

    @Test
    void play_랜덤숫자가_4보다작으면_전진하지않는다() {
        //given
        int randomNumber = 3;
        Car car = new Car("car1");
        //when
        PlayStatus playStatus = car.play(randomNumber);
        //then
        assertThat(playStatus.getCarPositionValue()).isEqualTo(0);
    }


}
