package test.com.lambda;

/**
 * Написати Predicate який буде отримувати число типу Integer та викликаючи метод test(T t) перевіряти чи воно більше 100 кллючно.
 * В консоль вивести 2 числа для прикладу.
 */
public interface MyPredicate<T> {
    boolean test(T t);
}
