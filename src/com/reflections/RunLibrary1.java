package com.reflections;

import java.lang.reflect.*;

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

    public static void main(String[] args) throws IllegalAccessException {
        Library library = new Library("SomeNameText", 123, false, "UA city Kiev str Pchilki");

        System.out.println("_______Ім'я класу___________");
        String className = library.getClass().getSimpleName();
        System.out.println("Class name: " + className);

        System.out.println("__________Модифікатори класу (public, private, protected, abstract, final тощо).______");
        int modifiersClass = library.getClass().getModifiers();
        System.out.println("Modifiers of Class: " + Modifier.toString(modifiersClass));

        System.out.println("____________Батьківський клас та інтерфейси, які він реалізує.___________");
        Class<?> superclass = library.getClass().getSuperclass();
        System.out.println("Parent Extends our Class: " + superclass);
        var interfaces = library.getClass().getInterfaces();

        for (
                Class<?> anInterface : interfaces) {
            System.out.println("Implements Interfaces name in Class: " + anInterface);
        }

        System.out.println("_________Поля класу, їх імена, модифікатори, типи._________");
        Field[] fieldsClass = library.getClass().getDeclaredFields();

        for (Field declaredField : fieldsClass) {
            String string = Modifier.toString(declaredField.getModifiers());
            if (declaredField.getModifiers() == 0) string += "default";
            String simpleName = declaredField.getType().getSimpleName();
            String fieldName = declaredField.getName();
            System.out.printf("%s %s %s %n", string, simpleName, fieldName);
        }

        System.out.println("_____________Конструктори класу, їх імена, модифікатори та параметри.______________");
        Constructor<?>[] constructors = library.getClass().getConstructors();
        Field[] fields = library.getClass().getDeclaredFields();
        System.out.println("Constructor name: " + constructors[0].getName());

        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
        }

        System.out.println("___________Методи класу, їх імена, модифікатори, типи повернення та параметри._____________");
        Method[] methods = library.getClass().getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("|1| Method named: " + method.getName() + "   |2| Modifiers: " + Modifier.toString(method.getModifiers()) +
                    "    |3| Return type: " + method.getReturnType().getName());
        }
        System.out.println("__________________________________________________________________");
    }
}