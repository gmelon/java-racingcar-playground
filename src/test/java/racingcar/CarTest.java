package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void move_isMovable이_true_이면_전진() {
        Car car = new Car("carA");
        car.move(() -> true);

        CarPosition carPosition = car.getPosition();
        assertThat(carPosition).isEqualTo(new CarPosition(1));
    }

    @Test
    void move_isMovable이_true_이면_전진하지_않음() {
        Car car = new Car("carA");
        car.move(() -> false);

        CarPosition carPosition = car.getPosition();
        assertThat(carPosition).isEqualTo(new CarPosition(0));
    }

    @Test
    void getBiggerCarPosition_자신이_큰_경우() {
        Car car = new Car("name", 3);
        CarPosition carPositionResult = car.getBiggerCarPosition(new CarPosition(2));

        assertThat(carPositionResult).isEqualTo(new CarPosition(3));
    }

    @Test
    void getBiggerCarPosition_자신이_작은_경우() {
        Car car = new Car("name", 2);
        CarPosition carPositionResult = car.getBiggerCarPosition(new CarPosition(4));

        assertThat(carPositionResult).isEqualTo(new CarPosition(4));
    }

}
