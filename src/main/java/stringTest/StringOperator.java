package stringTest;

import java.util.Arrays;

public class StringOperator {

    private final ExceptionHandleWrapper wrapper = new ExceptionHandleWrapper();
    private final String SEPARATOR = ",|:";

    public String[] split(StringWithSeparator stringWithSeparator) {
        String str = stringWithSeparator.getStr();
        if (stringWithSeparator.hasCustomSeparator()) {
            String substring = str.substring(4);
            return substring.split(addCustomSeparator(stringWithSeparator));
        }
        return str.split(SEPARATOR);
    }

    public String addCustomSeparator(StringWithSeparator stringWithSeparator) {
        if (stringWithSeparator.hasCustomSeparator()) {
            return SEPARATOR + "|" + stringWithSeparator.getCustomSeparator();
        }
        return SEPARATOR;
    }

    public int addition(StringWithSeparator stringWithSeparator) throws RuntimeException {
        if (validateOneNumber(stringWithSeparator)) {
            return wrapper.apply(stringWithSeparator.getStr());
        }
        if (validateEmpty(stringWithSeparator)) {
            return 0;
        }
        String[] strArray = split(stringWithSeparator);
        return Arrays.stream(strArray)
                .map(str -> wrapper.apply(str))
                .reduce(0, (a, b) -> a + b);
    }

    public boolean validateEmpty(StringWithSeparator stringWithSeparator) {
        if (stringWithSeparator.getStr() == null ||
                stringWithSeparator.getStr().isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean validateOneNumber(StringWithSeparator stringWithSeparator) {
        if (stringWithSeparator.getStr().length() == 1) {
            return true;
        }
        return false;
    }
}
