package stringTest;

public interface CustomHandleRuntimeException<T, R> {
    R apply(T t) throws RuntimeException;
}
