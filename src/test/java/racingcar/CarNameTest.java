package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarNameTest {

    @Test
    void CarName은_1자리이상_5자리이하_여야한다() {
        assertThatThrownBy(() -> new CarName("")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new CarName("abcdef")).isInstanceOf(IllegalArgumentException.class);

        String name = "abc";
        CarName carName = new CarName(name);
        assertThat(carName.getName()).isEqualTo(name);
    }

}
