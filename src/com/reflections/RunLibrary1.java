package com.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * PART 1
 * В методі main вивести на екран наступну інформацію:
 * Ім'я класу.
 * Модифікатори класу (public, private, protected, abstract, final тощо).
 * Батьківський клас та інтерфейси, які він реалізує.
 * Поля класу, їх імена, модифікатори, типи.
 * Конструктори класу, їх імена, модифікатори та параметри.
 * Методи класу, їх імена, модифікатори, типи повернення та параметри.
 */

public class RunLibrary1 {

    public static void main(String[] args) {
        Library library = new Library("SomeNameText", 123, false, "UA city Kiev str Electric");

        System.out.println("Our Class name: ");
        String className = library.getClass().getSimpleName();
        System.out.println(className + "\n");

        System.out.println("Modifiers of our Class:");
        int modifiersClass = library.getClass().getModifiers();
        System.out.println(modifiersClass == 0 ? "default" + "\n" : Modifier.toString(modifiersClass) + "\n");

        System.out.println("Parent Class of our Class,Implements Interfaces:");
        Class<?> superclass = library.getClass().getSuperclass();

        System.out.println(superclass.getSimpleName());

        var interfaces = library.getClass().getInterfaces();

        for (Class<?> anInterface : interfaces) {
            System.out.println("Class Implements Interfaces  " + anInterface.getSimpleName());
        }
        System.out.println();

        System.out.println("Field`s,Name`s,Modifier`s,Type of our Class:");
        Field[] fieldsClass = library.getClass().getDeclaredFields();

        for (Field declaredField : fieldsClass) {
            String fieldName = declaredField.getName();
            String fieldType = declaredField.getType().getSimpleName();
            System.out.println(fieldName + " - " + (modifiersClass == 0 ? "default" + "\n" : Modifier.toString(modifiersClass)) + " - " + fieldType);
        }
        System.out.println();

        System.out.println("Constructor`s,Name`s,Modifier`s,Type of our Class:");
        Constructor<?>[] constructors = library.getClass().getConstructors();

        System.out.println(constructors[0].getName());

        int constructorCounter = 1;

        for (Constructor<?> constructor : constructors) {
            System.out.println("#" + constructorCounter++);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }
        }
        System.out.println();

        System.out.println("Method`s,Name`s,Modifier`s,Type of our Class:");
        Method[] methods = library.getClass().getDeclaredMethods();
        int MethodCounter = 1;

        for (Method method : methods) {
            System.out.println("#" + MethodCounter++);
            System.out.println(method.getName() + "\n" +
                    (method.getModifiers() == 0 ? "default" : Modifier.toString(method.getModifiers())) +
                    "\n" + method.getReturnType().getSimpleName() +
                    "\n");
        }
    }
}