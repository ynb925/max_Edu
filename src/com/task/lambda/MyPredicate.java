package com.task.lambda;

@FunctionalInterface
public interface MyPredicate<T> {

    boolean test(T t);
}
