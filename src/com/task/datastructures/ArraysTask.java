package com.task.datastructures;

import java.util.Arrays;

/**
 * Створити однорівневий масив int розміром 10 пройтись по ньому через цикл for та заповнити числами  (від 0 до 9).
 * Потім викликати його та вивести по черзі всі значення в консоль.
 * * Створити дворівневий масив int розміром [2][5] і заповнити числами від весь масив числами починаючи з 0. Потім вивести все в консоль.
 */
public class ArraysTask {

    public static void main(String[] args) {
        int[] array1 = classicArray();
        int[][] array2 = secondArray();

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.deepToString(array2));
    }

    private static int[] classicArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    private static int[][] secondArray() {
        int[][] arr2 = new int[2][5];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < 5; j++) {
                arr2[i][j] = j;
            }
        }
        return arr2;
    }
}