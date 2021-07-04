package racing;

public class CarName {
    private final String name;

    public CarName(String name) {
        this.name = name;
    }

    public boolean isValidate() {
        if (this.name == null || this.name.length() == 0) {
            throw new IllegalArgumentException("자동차 이름은 공백이나 null일수 없습니다.");
        }

        if (this.name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이상일 수 없습니다.");
        }

        return true;
    }

    public String getName() {
        return name;
    }
}
