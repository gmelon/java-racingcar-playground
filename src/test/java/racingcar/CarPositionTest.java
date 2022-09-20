package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarPositionTest {

    @Test
    void move메소드_실행시_position_1_증가() {
        CarPosition carPosition = new CarPosition();
        carPosition.move();

        assertThat(carPosition).isEqualTo(new CarPosition(1));
    }

    @Test
    void isBiggerThan_주어진_값_보다_자신의_position이_더_크면_true_반환() {
        CarPosition carPosition2 = new CarPosition(2);
        CarPosition carPosition1 = new CarPosition(1);

        assertThat(carPosition2.isBiggerThan(carPosition1)).isTrue();
    }

}
