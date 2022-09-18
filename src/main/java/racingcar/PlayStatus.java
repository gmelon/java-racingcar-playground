package racingcar;

public class PlayStatus {

    private CarName carName;
    private CarPosition carPosition;

    public static final String STR_POSITION = "-";

    public PlayStatus(CarName carName, CarPosition carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
    }

    public String getStatusMessage() {
        String statusMessage = "";
        for (int i = 0; i < this.getCarPositionValue(); i++) {
            statusMessage += STR_POSITION;
        }
        return this.getCarNameValue() + " : " + statusMessage;
    }

    public int getCarPositionValue() {
        return carPosition.getValue();
    }

    public String getCarNameValue() {
        return carName.getValue();
    }

    public boolean isOverMaxPosition(int maxPosition) {
        return this.getCarPositionValue() >= maxPosition;
    }

}
