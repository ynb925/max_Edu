package test.com.lambda;

@FunctionalInterface
public interface MyConsumer<T> {
    void accept(T t);

}
