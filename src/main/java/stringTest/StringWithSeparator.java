package stringTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWithSeparator {

    private final String REGEX = "//(.)\n(.*)";
    private final String str;
    private final String customSeparator;

    public StringWithSeparator(String str) {
        this.str = str;
        this.customSeparator = makeCustomSeparator();
    }

    public String getStr() {
        return str;
    }

    public String getCustomSeparator() {
        return customSeparator;
    }

    public String makeCustomSeparator() {
        String str = this.str;
        if (this.str == null || this.str.isEmpty()) {
            str = "";
        }

        Matcher matcher = Pattern.compile(REGEX).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    public boolean hasCustomSeparator() {
        return customSeparator != null && !customSeparator.isEmpty();
    }
}
