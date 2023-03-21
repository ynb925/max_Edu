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

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        Library library = new Library("libka", 123, true, "etrte");
        System.out.println(library + " - this is original Object from class Library");
        System.out.println("--------------------------------------------------------------------------");

        createObjectWithoutConstructor();
        System.out.println("--------------------------------------------------------------------------");
        createObjectByConstructor();
    }

    private static void createObjectWithoutConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Library library1 = Library.class.getDeclaredConstructor().newInstance();
        System.out.println(library1 + " - without use constructor");
    }

    private static void createObjectByConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Library> libraryClass = Library.class;
        Constructor<Library> constructor = libraryClass.getConstructor(String.class, int.class, boolean.class, String.class);
        constructor.setAccessible(true);
        Library library1 = constructor.newInstance("gagag", 556, false, "last");
        System.out.println(library1 + " - use constructor");
    }
}