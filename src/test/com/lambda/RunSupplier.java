package test.com.lambda;

/**
 * Supplier:
 * Написати Supplier який повертає Integer і викликаючи метод get() повертає рандомне число від 0 100. Вивести його в консоль.
 */
public class RunSupplier {
    public static void main(String[] args) {
        MySupplier<Integer> supplier = () -> {
            return (int) (Math.random() * 100);
        };
        System.out.println(supplier.get());
    }
}
