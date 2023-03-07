package test.com.constructions;

import java.util.Scanner;

/**
 * Умовна конструкція if - else.
 * Створити клас Calculator і в ньому створити метод public void calculate (int number),
 * який в залежності від того парна чи не парна цифра передана в нього буде виводити різні повідомлення у консоль.
 */

public class Calculator_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        calculate(num);
    }

    static public void calculate(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " - is even");
        } else {
            System.out.println(number + " - is odd");
        }
    }
}
