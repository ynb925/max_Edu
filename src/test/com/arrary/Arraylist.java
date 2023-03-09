package test.com.arrary;

import java.util.ArrayList;
import java.util.List;

/**
 * Створити ArrayList стрінгів numbers з назвами цифр від нуля до 10,
 * потім використовуючи синтаксис for(String number : numbers) пройтись по ньому і вивести його в консоль.
 * Друге завдання замінити 3 і 5 номера на цифри (просто як стрінги будуть але цифри замість слів). Перевірити результат виведенням в консоль
 * Третє завдання видалити 2 і 9 цифри і вивести в консоль
 */
public class Arraylist {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>(List.of("one", "two", "tree", "four", "five", "six", "seven", "eight", "nine", "ten"));

        System.out.println("1st part");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("2nd part");
        numbers.set(numbers.indexOf("tree"), "3");
        numbers.set(numbers.indexOf("five"), "5");
        System.out.println(numbers);

        System.out.println("3nd part");
        numbers.remove("two");
        numbers.remove("nine");
        System.out.println(numbers);
    }
}
