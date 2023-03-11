package com.task.loops;

import java.util.Scanner;

/**
 * Цикл for:
 * Дані два цілих числа int a та int b .
 * Потрібно вивести числа від a до b включно,
 * у порядку зростання, якщо a < b, або у порядку зменшення якщо a > b.
 */
public class For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st num");
        int num1 = sc.nextInt();
        System.out.println("enter 2nd num");
        int num2 = sc.nextInt();

        job(num1, num2);
    }

    static public void job(int a, int b) {
        if (a < b) {
            System.out.println(a + "-->" + b + "  a < b");
            for (int i = a; i < b; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println(a + "<--" + b + "  a > b");
            for (int i = a; i > b; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
