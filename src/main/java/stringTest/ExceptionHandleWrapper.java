package stringTest;

public class ExceptionHandleWrapper implements CustomHandleRuntimeException<String, Integer> {
    @Override
    public Integer apply(String s) throws RuntimeException {
        try {
            int integer = Integer.parseInt(s);
            if (integer < 0) {
                throw new RuntimeException("음수는 변환할 수 없습니다.");
            }
            return integer;
        } catch (NumberFormatException e) {
            throw new RuntimeException("문자는 변환할 수 없습니다.");
        }

    }
}
