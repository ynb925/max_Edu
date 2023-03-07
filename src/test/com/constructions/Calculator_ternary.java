package test.com.constructions;

import java.util.Scanner;

/**
 * Умовна конструкція з тернарним оператором:
 * Створити у класі Calculator метод calculateTernary(int number)
 * який повинен робити те ж саме що метод calculate але при
 * цьому використовувати тернарний умовний оператор.
 * Приклад: 1 - “Odd number: 1”, 2 - “Even number: 2”.
 */

public class Calculator_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(calculate(num));
    }

    static public String calculate(int number) {
        return number % 2 == 0 ? number + " - Even number" : number + " - Odd number";
    }
}
