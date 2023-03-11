package com.serial;

import java.io.Serializable;

/**
 * Створити клас Body який імплементує інтерфейс Serializable зі змінними int height
 * та String name. У класі Test створити метод main і зробити в ньому блок try-catch
 * де буде спочатку реалізована серіалізація задопомогою класу FileOutputStream і
 * ObjectOutputStream і його методом writeObject; А після того в наступному блоці
 * try-catch реалізувати десеріалізацію задопомогою класів FileInputStream та
 * ObjectInputStream та його методу readObject. Не забувати закривати стріми.
 * Вивести у консоль те що серіалізовувалось і десеріалізовувалось. Виключення обробити
 * виведенням на екран типу ексепшену.
 */

public class Body implements Serializable {

    private static final long serialVersionUID = 14376375L;
    private int height;
    private String name;

    public Body(int height, String name) {
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Body{" +
                "height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
