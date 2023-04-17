package com.task.abstractclass;

public class Human extends Animal{

    @Override
    void move() {
        System.out.println("walk");
    }

    @Override
    void talk() {
        System.out.println("hello");
    }
}
