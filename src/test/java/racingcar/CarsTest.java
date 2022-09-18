package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarsTest {

    Car car1;
    Car car2;
    Car car3;

    @BeforeEach
    void setUp() {
        car1 = new Car("car1");
        car2 = new Car("car2");
        car3 = new Car("car3");
    }

    @Test
    void Cars_생성() {
        assertThatNoException().isThrownBy(() -> new Cars(Arrays.asList(car1, car2, car3)));
    }

    @Test
    void Cars_size_조회() {
        Cars cars = new Cars(Arrays.asList(car1, car2, car3));
        assertThat(cars.size()).isEqualTo(3);
    }

    @Test
    void play_전체_car_랜덤전진() {
        Cars cars = new Cars(Arrays.asList(car1, car2, car3));
        List<PlayStatus> playStatuses = cars.play();

        List<Integer> carPositionValues = playStatuses.stream().map(PlayStatus::getCarPositionValue).collect(
            Collectors.toList());
        assertThat(carPositionValues).containsAnyOf(0,1);
    }

}

