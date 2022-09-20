package racingcar.utils;

import java.util.Random;

public class RandomNumberGenerator {

    public static int getRandomNumber(int limit) {
        Random random = new Random();
        return random.nextInt(limit);
    }

}
