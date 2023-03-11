package com.task.lambda;

@FunctionalInterface
public interface MyConsumer<T> {

    void accept(T t);

}
