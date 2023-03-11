package com.task.lambda;

/**
 * Написати Predicate який буде отримувати число типу Integer та викликаючи метод test(T t) перевіряти чи воно більше 100 кллючно.
 * В консоль вивести 2 числа для прикладу.
 */
public class RunPredicate {

    public static void main(String[] args) {
        MyPredicate<Integer> myPredicate = x -> x >= 100;

        System.out.println(myPredicate.test(90));
        System.out.println(myPredicate.test(111));

    }
}
