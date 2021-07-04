package utils;

import java.util.Random;

public class RandomUtils {

    public static int getRandomNum() {
        return new Random().nextInt(8) + 1;
    }
}
