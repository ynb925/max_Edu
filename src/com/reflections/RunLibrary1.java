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
 * <p>
 */

public class RunLibrary1 {

    public static void main(String[] args)      {
        Library library = new Library("SomeNameText", 123, false, "UA city Kiev str Electric");

        System.out.println("_______Ім'я класу___________");
        String className = library.getClass().getSimpleName();
        System.out.println("Class name: " + className);
        System.out.println();

        System.out.println("__________Модифікатори класу (public, private, protected, abstract, final тощо).______");
        int modifiersClass = library.getClass().getModifiers();
        System.out.println("Modifiers of " + className + " is: " + (modifiersClass == 0 ? "default" : Modifier.toString(modifiersClass)));
        System.out.println();

        System.out.println("____________Батьківський клас та інтерфейси, які він реалізує.___________");
        Class<?> superclass = library.getClass().getSuperclass();
        System.out.println("Parent of " + className + " is: " + superclass.getSimpleName());
        var interfaces = library.getClass().getInterfaces();

        for (Class<?> anInterface : interfaces) {
            System.out.println(className + " Implements Interfaces: " + anInterface.getSimpleName());
        }
        System.out.println();

        System.out.println("_________Поля класу, їх імена, модифікатори, типи._________");
        Field[] fieldsClass = library.getClass().getDeclaredFields();

        for (Field declaredField : fieldsClass) {
            String fieldName = declaredField.getName();
            String fieldModifier = Modifier.toString(declaredField.getModifiers());
            if (declaredField.getModifiers() == 0) fieldModifier += "default";
            String fieldType = declaredField.getType().getSimpleName();
            System.out.println(className + " fieldName: " + fieldName + " fieldModifier: " + fieldModifier + " fieldType: " + fieldType);
        }
        System.out.println();

        System.out.println("_____________Конструктори класу, їх імена, модифікатори та параметри.______________");
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

        System.out.println("___________Методи класу, їх імена, модифікатори, типи повернення та параметри._____________");
        Method[] methods = library.getClass().getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("|1| Method named: " + method.getName() + "\n|2| Modifiers: " +
                    Modifier.toString(method.getModifiers()) +
                    "\n|3| Return type: " + method.getReturnType().getName() +
                    "\n---------------------");
        }
    }
}