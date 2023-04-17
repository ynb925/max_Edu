package com.task.lambda;

@FunctionalInterface
public interface MySupplier<T> {

    T get();

}
