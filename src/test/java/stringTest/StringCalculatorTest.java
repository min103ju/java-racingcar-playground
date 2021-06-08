package sringTest;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    @Test
    void getCustomRegex() {
        // given
//        String regex = "//(.)\n(.*)";
        String str = "//.\n1;2;3";

        // when
        StringCalculator calculator = new StringCalculator();
        String seperator = calculator.getCustomRegex(str);

        // then
        assertThat(separator).isEqualTo(".");


        Matcher matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            String separator = matcher.group(1);

        }
    }
}
