package com.task.string;

/**
 * Створити клас Converter з методом convert який приймає текст,
 * <p>
 * прибирає з початку, з кінця і з середини пробіли,
 * <p>
 * робить все маленьким шрифтом, обертає текст навпаки, розділяє його навпіл
 * (якщо не рівно то перша частина на 1 символ буде більшою) і виводить в консоль результат.
 * <p>
 * На вхід: “ Some other Day “, на виході: yadreh toemos
 * На вхів: “     Do the riGht thinG”   , на виході: gnihtthg irehtod
 */
public class Converter {

    private static String str1 = " Some other Day ";
    private static String str2 = "      Do the riGht thinG";

    public static void main(String[] args) {
        converter(str1);
        converter(str2);
    }

    public static void converter(String str) {
        String input = str.replaceAll(" ", "");
        StringBuilder builder = new StringBuilder(input.toLowerCase());
        StringBuilder reversedInput = builder.reverse();

        String firstPart = reversedInput.substring(0, reversedInput.length() / 2);
        String secondPart = reversedInput.substring(reversedInput.length() / 2, reversedInput.length());

        if (firstPart.length() < secondPart.length()) {
            firstPart = reversedInput.substring(0, (reversedInput.length() + 1) / 2);
            secondPart = reversedInput.substring(((reversedInput.length() + 1) / 2), reversedInput.length());
            System.out.println(firstPart + " " + secondPart);
        } else {
            System.out.println(firstPart + " " + secondPart);
        }
    }
}


