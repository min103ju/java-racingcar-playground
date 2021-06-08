package stringTest;

public class StringCalculator {

    private final String SEPARATOR = ",|:";

    public String[] split(StringWithSeparator stringWithSeparator) {
        return stringWithSeparator.getStr().split(SEPARATOR);
    }
}
