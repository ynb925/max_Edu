package test.com.loops;

import java.util.Scanner;

/**
 * Цикл while:
 * У метод приходить число яке більше ніж 0,
 * потрібно вивести усі числа починаючи з 0 до цього числа включно.
 */
public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        job(num);
    }

    static public void job(int number) {
        int a = 0;

        while (a <= number) {
            System.out.print(a + " ");
            a++;
        }
    }
}