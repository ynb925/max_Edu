package com.task.lambda;
@FunctionalInterface
public interface MyFunction<T, R> {

      R applay(T t);
}
