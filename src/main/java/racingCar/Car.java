package racingCar;

import java.util.Random;

public class Car {
    private int position;
    private String name;
    private int randomValue;

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 넘길 수 없습니다.");
        }
        this.name = name;
        this.position = 0;
    }

    public int getRandomValue() {
        Random random = new Random();
        randomValue = random.nextInt(8) + 1;
        return randomValue;
    }

    public void move() {
        this.position++;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
