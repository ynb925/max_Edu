package test.com.exeptions;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


/**
 * Напиши клас, який виконує наступні дії:
 * 1. Приймає з клавіатури два цілих числа розділених комою.
 * 2. Створює і виводить в консоль 20 випадкових чисел у діапазоні від першого, тільки що введеного з клавіатури,
 * значення до другого значення, також введеного з клавіатури перед цим.
 * Можна виходити з того, що перше з чисел повинно бути менше другого. Для цього потрібен ексепшн.
 * Приклад:
 * Вхід: 1,10    Вихід: 42958147591451412345
 * Вхід: 5,1      Вихід: IllegalArgumentException “first number should be less than second”
 * Вхід: %,№   Вихід: IllegalArgumentException “illegal symbols, use only numbers”
 * Вхід: 1,2,5    Вихід: IllegalArgumentException “maximum 2 numbers”
 */
public class MyExeptions {
    public static void main(String[] args) {
        final int limitNum = 20;

        Random rd = new Random();

        Scanner sc = new Scanner(System.in);

        String strIn = sc.nextLine();
        String[] strSplit = strIn.split(",");

        try {
            int value1 = Integer.parseInt(strSplit[0]);
            int value2 = Integer.parseInt(strSplit[1]);

            if (value1 > value2) {
                throw new IllegalArgumentException("first number should be less than second");
            }
            if (strSplit.length > 2) {
                throw new IllegalArgumentException("maximum 2 numbers");
            } else {
                for (int i = 0; i < limitNum; i++) {
                    System.out.print(rd.nextInt(value2) + value1);
                }
            }
        } catch (NumberFormatException | InputMismatchException e) {
            throw new IllegalArgumentException("illegal symbols, use only numbers");
        }
    }
}
