package test.com.oop;

/**
 * Клас Phone
 * Створити клас Phone, який містить змінні number, model, weight
 * Створити три екземпляри цього класу
 * Вивести у консоль значення їх змінних
 * Додати у клас Phone методи: receiveCall, який приймає один параметр - імʼя того хто звонить. Виводить у консоль сповіщення
 * “{name} is calling”. getNumber - повертає номер телефону. Викликати ці методи для кожного з обʼєктів.
 * Додати конструктор у клас Phone, який приймає на вхід три параметри для ініціалізації змінних класу - number, model, weight.
 * Додати конструктор у клас Phone, який приймає на вхід два параметри для ініціалізації змінних класу - number, model
 * Додати конструктор без параметрів.
 * Викликати з конструктора з трьома параметрами конструктор з двома.
 * Додати перегружений метод receiveCall, який приймає два параметри - імʼя людини яка телефонує і номер телефону людини яка телефонує. Викликати цей метод.
 */
public class Phone {
    protected String number;
    protected String model;
    protected double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println(name + " is calling from " + callerNumber);
    }

    public String getNumber() {
        return number;
    }
}
