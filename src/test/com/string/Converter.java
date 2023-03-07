package test.com.string;

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

        String s = str.replaceAll(" ", "");

        StringBuilder builder = new StringBuilder(s.toLowerCase());

        StringBuilder reverse = builder.reverse();
        String firstPart = reverse.substring(0, reverse.length() / 2);
        String secondPart = reverse.substring(reverse.length() / 2, reverse.length());


        if (firstPart.length() < secondPart.length()) {
            firstPart = reverse.substring(0, (reverse.length() + 1) / 2);
            secondPart = reverse.substring(((reverse.length() + 1) / 2), reverse.length());
            System.out.println(firstPart + " " + secondPart);
        } else {
            System.out.println(firstPart + " " + secondPart);
        }
    }
}


