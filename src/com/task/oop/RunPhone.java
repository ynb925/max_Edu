package com.task.oop;

public class RunPhone {

    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Samsung", 0.3);
        Phone phone2 = new Phone("987654321", "iPhone");
        Phone phone3 = new Phone();

        phone1.receiveCall("vasya");
        phone2.receiveCall("petya");
        phone3.receiveCall("ivan");

        phone1.receiveCall("katya", "555-1234");
    }
}