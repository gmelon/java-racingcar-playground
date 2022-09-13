package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class CarNameTest {

    @Test
    void carName_기본생성() {
        String carName = "hyun";
        CarName carNameObj = new CarName(carName);
        assertThat(carNameObj.getCarName()).isEqualTo(carName);
    }

    @Test
    void carName은_5자리를_초과할수업다() {
        String carName = "sanghyeok";
        assertThatThrownBy(() -> new CarName(carName))
            .isInstanceOf(IllegalArgumentException.class);
    }

}
