package com.task.abstractclass;

public class Horse extends Animal {

    @Override
    void move() {
        System.out.println("run");
    }

    @Override
    void talk() {
        System.out.println("IGOOO iggoo");
    }
}
