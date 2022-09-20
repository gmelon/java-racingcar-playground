package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CarsTest {

    @Test
    void getCars() {
        Car carA = new Car("carA");
        Car carB = new Car("carB");
        Cars cars = new Cars(Arrays.asList(carA, carB));

        assertThat(cars.getCars()).contains(carA, carB);
    }

    @Test
    void move_전진_O() {
        Car carA = new Car("carA");
        Car carB = new Car("carB");
        Cars cars = new Cars(Arrays.asList(carA, carB));

        cars.move(() -> true);

        List<Car> carList = cars.getCars();

        for (Car car : carList) {
            assertThat(car.getPosition()).isEqualTo(new CarPosition(1));
        }
    }

    @Test
    void move_전진_X() {
        Car carA = new Car("carA");
        Car carB = new Car("carB");
        Cars cars = new Cars(Arrays.asList(carA, carB));

        cars.move(() -> false);

        List<Car> carList = cars.getCars();

        for (Car car : carList) {
            assertThat(car.getPosition()).isEqualTo(new CarPosition(0));
        }
    }

    @Test
    void findWinners() {
        Car carA = new Car("carA", 2);
        Car carB = new Car("carB", 3);
        Car carC = new Car("carC", 3);
        Cars cars = new Cars(Arrays.asList(carA, carB, carC));

        List<Car> winnerCars = cars.findWinners();
        assertThat(winnerCars).containsExactly(carB, carC);
    }

    @Test
    void getMaxPosition() {
        Car carA = new Car("carA", 2);
        Car carB = new Car("carB", 3);
        Car carC = new Car("carC", 3);
        Cars cars = new Cars(Arrays.asList(carA, carB, carC));

        CarPosition carPosition = cars.getMaxPosition();
        assertThat(carPosition).isEqualTo(new CarPosition(3));
    }

}
