package racingcar;

public class CarName {

    private final String name;

    /**
     * 상수 선언
     */
    private final int CARNAME_LENGTH_LIMIT = 5;
    private final String ILLEGAL_CARNAME_LENGTH_EXCEPTION = "자동차의 이름은 5자리를 초과할 수 없습니다.";

    public CarName(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name.length() > CARNAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException(ILLEGAL_CARNAME_LENGTH_EXCEPTION);
        }
    }

    public String getName() {
        return name;
    }
}
