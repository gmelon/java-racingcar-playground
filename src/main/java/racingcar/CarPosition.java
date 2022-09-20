package racingcar;

import java.util.Objects;

public class CarPosition {

    private int position;

    public CarPosition() {
        this(0);
    }

    public CarPosition(int position) {
        this.position = position;
    }

    public void move() {
        position++;
    }

    public boolean isBiggerThan(CarPosition carPosition) {
        return this.position > carPosition.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CarPosition that = (CarPosition) o;
        return position == that.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
