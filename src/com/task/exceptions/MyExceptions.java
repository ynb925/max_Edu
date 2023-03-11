package com.task.exceptions;

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
public class MyExceptions {

    public static void main(String[] args) {
        final int randomLimitNums = 20;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String lineIn = scanner.nextLine();

        String[] splitArray = lineIn.split(",");
        if (splitArray.length != 2) {
            throw new IllegalArgumentException("maximum 2 numbers");
        }
        try {
            int value1 = Integer.parseInt(splitArray[0]);
            int value2 = Integer.parseInt(splitArray[1]);

            if (value1 > value2) {
                throw new IllegalArgumentException("first number should be less than second");
            }

            for (int i = 0; i < randomLimitNums; i++) {
                System.out.print(random.nextInt(value2) + value1);
            }
        } catch (NumberFormatException | InputMismatchException e) {
            throw new IllegalArgumentException("illegal symbols, use only numbers");
        }
    }
}
