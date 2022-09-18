package racingcar;

public class Car {

    private final CarName carName;
    private final CarPosition carPosition;

    private final int FORWARD_THRESHOLD = 4;
    public static final int MAX_RAND_NUMBER = 9;

    public Car(String name) {
        this.carName = new CarName(name);
        this.carPosition = new CarPosition();
    }

    public CarName getName() {
        return carName;
    }

    public CarPosition getPosition() {
        return carPosition;
    }

    public PlayStatus play(int randomNumber) {
        if (randomNumber >= FORWARD_THRESHOLD && randomNumber <= MAX_RAND_NUMBER) {
            carPosition.stepForward();
        }
        return new PlayStatus(carName, carPosition);
    }
}
