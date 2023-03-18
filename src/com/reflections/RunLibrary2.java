package com.reflections;

/**
 * * PART 2
 * * В тому ж методі main зробити наступні дії:
 * * Створити об’єкт класу Library не використовуючи конструктор.
 * * Створити ще один об’єкт використовуючи конструктор.
 * * В обох об’єктів замінити значення всіх полів, які мають модифікатор доступу private або final за допомогою інструментів reflection APІ.
 */

public class RunLibrary2 {

    public static void main(String[] args) throws IllegalAccessException {
        //Library library = new Library("SomeNameText", 123, false, "UA city Kiev str Pchilki");
        Library library = new Library();

        System.out.println("_______Ім'я класу___________");
        String className = library.getClass().getSimpleName();
        System.out.println(className);
        System.out.println();
        System.out.println("__________________________________________________________________");

    }
}
