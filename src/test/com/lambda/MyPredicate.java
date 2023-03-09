package test.com.lambda;

@FunctionalInterface
public interface MyPredicate<T> {
    boolean test(T t);
}
