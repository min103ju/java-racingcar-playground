package car;

import utils.StringUtils;

public class CarName {
    private final String name;

    public CarName(String name) {
        if (!StringUtils.hasText(name)) {
            throw new IllegalArgumentException("이름은 공백이 올수 없습니다.");
        }

        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자를 넘길 수 없습니다.");
        }

        this.name = name;
    }
}
