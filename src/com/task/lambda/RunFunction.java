package com.task.lambda;

/**
 * Написати Function який приймає String і повертає Integer. Метод apply(T t) повертає кількість символів у переданому String.
 */
public class RunFunction {

    public static void main(String[] args) {
        MyFunction<String, Integer> myFunction = String::length;
        System.out.println(myFunction.applay("hello"));
    }
}
