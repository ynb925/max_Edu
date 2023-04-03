package com.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * * PART 2
 * * В тому ж методі main зробити наступні дії:
 * * Створити об’єкт класу Library не використовуючи конструктор.
 * * Створити ще один об’єкт використовуючи конструктор.
 * * В обох об’єктів замінити значення всіх полів, які мають модифікатор доступу private або final за допомогою інструментів reflection APІ.
 */

public class RunLibrary2 {

    public static void main(String[] args) {
        Library library = new Library("name", 123, true, "any address");
        System.out.println(library + " - this is original Object from class Library");
        System.out.println("--------------------------------------------------------------------------");

        createObjectWithoutConstructor();
        System.out.println("--------------------------------------------------------------------------");
        createObjectByConstructor();
    }

    private static void createObjectWithoutConstructor() {
        Library library1 = null;

        try {
            library1 = Library.class.getDeclaredConstructor().newInstance();
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException |
                 NoSuchMethodException e) {
            System.out.println(library1 + " - without use constructor");
            throw new RuntimeException(e);
        }
    }

    private static void createObjectByConstructor() {
        Class<Library> libraryClass = Library.class;
        Library library1;

        try {
            Constructor<Library> constructor = libraryClass.getConstructor(String.class, int.class, boolean.class, String.class);
            constructor.setAccessible(true);
            library1 = constructor.newInstance("gagag", 556, false, "last");
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        System.out.println(library1 + " - use constructor");
    }
}