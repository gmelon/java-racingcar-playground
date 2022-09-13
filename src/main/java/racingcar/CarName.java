package racingcar;

public class CarName {

    private final String carName;

    /**
     * 상수 선언
     */
    private final int CARNAME_LENGTH_LIMIT = 5;
    private final String ILLEGAL_CARNAME_LENGTH_EXCEPTION = "자동차의 이름은 5자리를 초과할 수 없습니다.";

    public CarName(String carName) {
        validateCarName(carName);
        this.carName = carName;
    }

    private void validateCarName(String carName) {
        if (carName.length() > CARNAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException(ILLEGAL_CARNAME_LENGTH_EXCEPTION);
        }
    }

    public String getCarName() {
        return carName;
    }
}
