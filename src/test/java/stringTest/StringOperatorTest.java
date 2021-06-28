package stringTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringOperatorTest {

    StringOperator stringOperator;

    @BeforeEach
    void setUp() {
        stringOperator = new StringOperator();
    }

    @Test
    void validateOneNumber() {
        // given
        StringWithSeparator stringWithSeparator = new StringWithSeparator("1");

        // when
        boolean validate = stringOperator.validateOneNumber(stringWithSeparator);

        // then
        assertThat(validate).isTrue();
    }

    @Test
    void throwRuntimeException() throws Exception {
        // given
        StringWithSeparator stringWithSeparator = new StringWithSeparator("1,2,-1");

        // when

        // then
        assertThatExceptionOfType(RuntimeException.class).isThrownBy(() ->
            stringOperator.addition(stringWithSeparator)
        ).withMessageMatching("음수는 변환할 수 없습니다.");
    }

    @Test
    void validateEmpty() {
        // given
        StringWithSeparator stringWithSeparator = new StringWithSeparator(null);

        // when
        boolean validate = stringOperator.validateEmpty(stringWithSeparator);

        // then
        assertThat(validate).isTrue();

    }

    @Test
    void addition() {
        // given
        StringWithSeparator stringWithSeparator = new StringWithSeparator("//@\n1:2,3@4");

        // when
        int result = stringOperator.addition(stringWithSeparator);

        // then
        assertThat(result).isEqualTo(10);
    }

    @Test
    void splitWithCustomSeparator() {
        // given
        StringWithSeparator stringWithSeparator = new StringWithSeparator("//@\n1:2,3@4");

        // when
        String[] strArray = stringOperator.split(stringWithSeparator);

        // then
        assertThat(strArray).contains("1", "2", "3", "4");
    }

    @Test
    void addCustomSeparator() {
        // given
        StringWithSeparator stringWithSeparator = new StringWithSeparator("//@\n1:2,3@4");

        // when
        String regex = stringOperator.addCustomSeparator(stringWithSeparator);

        // then
        assertThat(regex).isEqualTo(",|:|@");
    }

    @Test
    void split() {
        // given
        StringWithSeparator stringWithSeparator = new StringWithSeparator("1,2,3");

        // when
        String[] strArray = stringOperator.split(stringWithSeparator);

        // then
        assertThat(strArray.length).isEqualTo(3);
    }

    @Test
    void getCustomRegex() {
        // given
        StringWithSeparator stringWithSeparator = new StringWithSeparator("//@\n1;2;3");

        // when
        String separator = stringWithSeparator.getCustomSeparator();

        // then
        assertThat(separator).isEqualTo("@");

    }
}
