package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void move(MovingStrategy movingStrategy) {
        for (Car car : cars) {
            car.move(movingStrategy);
        }
    }

    public List<Car> findWinners() {
        CarPosition maxPosition = this.getMaxPosition();
        List<Car> winnerCars = new ArrayList<>();
        for (Car car : cars) {
            checkCarPositionEqualToMaxPosition(maxPosition, winnerCars, car);
        }
        return winnerCars;
    }

    private void checkCarPositionEqualToMaxPosition(CarPosition maxPosition, List<Car> winnerCars,
        Car car) {
        if (car.getPosition().equals(maxPosition)) {
            winnerCars.add(car);
        }
    }

    CarPosition getMaxPosition() {
        CarPosition carPosition = new CarPosition();
        for (Car car : cars) {
            carPosition = car.getBiggerCarPosition(carPosition);
        }
        return carPosition;
    }
}
