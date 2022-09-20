package racingcar;

import java.util.Objects;

public class Car {

    private final CarName carName;
    private CarPosition carPosition;

    public Car(String carName) {
        this(carName, 0);
    }

    public Car(String carName, int carPosition) {
        this.carName = new CarName(carName);
        this.carPosition = new CarPosition(carPosition);
    }

    public CarPosition getPosition() {
        return carPosition;
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.isMovable()) {
            carPosition.move();
        }
    }

    public CarPosition getBiggerCarPosition(CarPosition givenCarPosition) {
        if (this.carPosition.isBiggerThan(givenCarPosition)) {
            return this.carPosition;
        }
        return givenCarPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(carName, car.carName) && Objects.equals(carPosition,
            car.carPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, carPosition);
    }
}
