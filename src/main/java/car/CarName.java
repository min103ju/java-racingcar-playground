package car;

import utils.StringUtils;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
