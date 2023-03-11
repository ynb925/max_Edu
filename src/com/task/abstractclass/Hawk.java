package com.task.abstractclass;

public class Hawk extends Animal {

    @Override
    void move() {
        System.out.println("fly");
    }

    @Override
    void talk() {
        System.out.println("kar kar");
    }
}
