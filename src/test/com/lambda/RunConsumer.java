package test.com.lambda;

/**
 * Consumer:
 * Написати Consumer який приймає String і викликаючи метод accept(T t) виводить на екран переданий текст.
 */
public class RunConsumer {
    public static void main(String[] args) {
        MyConsumer<String> consumer = System.out::println;
        consumer.accept("test consumer");
    }
}
