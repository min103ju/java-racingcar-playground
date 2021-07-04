package utils;

public class StringUtils {

    public static boolean hasText(String str) {
        return str != null && !str.equals("") && str.length() != 0;
    }
}
