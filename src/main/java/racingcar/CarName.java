package racingcar;

import java.util.Objects;

public class CarName {

    private final String name;

    public CarName(String name) {
        name = name.trim();
        validateName(name);
        this.name = name;
    }

    private static void validateName(String name) {
        if (name.length() == 0 || name.length() >= 6) {
            throw new IllegalArgumentException("차 이름은 1-5자리여야 합니다.");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
