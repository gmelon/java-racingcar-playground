package racingcar;

import java.util.ArrayList;
import java.util.List;
import racingcar.utils.RandomNumberGenerator;

public class Cars {

    public static final int RANDOM_NUMBER_LIMIT = 10;
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public int size() {
        return cars.size();
    }

    public List<PlayStatus> play() {
        List<PlayStatus> playStatuses = new ArrayList<>();
        cars.forEach(car -> {
            int randomNumber = RandomNumberGenerator.getRandomNumber(RANDOM_NUMBER_LIMIT);
            playStatuses.add(car.play(randomNumber));
        });
        return playStatuses;
    }
}
