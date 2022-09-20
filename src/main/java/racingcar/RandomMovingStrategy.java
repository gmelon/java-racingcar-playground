package racingcar;

import racingcar.utils.RandomNumberGenerator;

public class RandomMovingStrategy implements MovingStrategy{

    @Override
    public boolean isMovable() {
        return RandomNumberGenerator.getRandomNumber(10) >= 4;
    }
}
