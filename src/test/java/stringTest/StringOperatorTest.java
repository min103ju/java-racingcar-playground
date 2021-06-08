package stringTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    StringCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }

    @Test
    void addition() {/*
        // given
        String str = "//.\n1:2,3.4";

        // when
        int result = calculator.addition(str);

        // then
        assertThat(result).isEqualTo(10);*/
    }

    @Test
    void splitWithCustomSeparator() {
        // given
        StringWithSeparator stringWithSeparator = new StringWithSeparator("//.\n1:2,3.4");

        // when
        String[] strArray = calculator.split(stringWithSeparator);

        // then
        assertThat(strArray.length).isEqualTo(4);
    }

    @Test
    void addCustomSplit() {s
    }

    @Test
    void split() {
        // given
        StringWithSeparator stringWithSeparator = new StringWithSeparator("1,2,3");

        // when
        String[] strArray = calculator.split(stringWithSeparator);

        // then
        assertThat(strArray.length).isEqualTo(3);
    }

    @Test
    void getCustomRegex() {
        // given
        StringWithSeparator stringWithSeparator = new StringWithSeparator("//.\n1;2;3");

        // when
        String separator = stringWithSeparator.getCustomSeparator();

        // then
        assertThat(separator).isEqualTo(".");

    }
}
