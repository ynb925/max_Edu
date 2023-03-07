package test.com.lambda;

/**
 * Створити функціональний інтерфейс Boomer, з методом boom, який нічого не повертає і не приймає.
 * У методі main створити змінну типу Boomer з назвою boom, а в значення передати лямбда вираз який буде виводити у консоль фразу “Let’s boom!”
 */
public class Lambda {
    public static void main(String[] args) {
        Boomer boom = () -> System.out.println("Let’s boom!");
        boom.boom();
    }
}
