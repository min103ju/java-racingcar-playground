package racing;

import java.util.Random;

public class RandomUtils {
    public static int getRandomNumber() {
        return new Random().nextInt(8) + 1;
    }
}
