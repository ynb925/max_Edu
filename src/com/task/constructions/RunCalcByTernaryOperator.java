package com.task.constructions;

import java.util.Scanner;

public class RunCalcByTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CalcByTernaryOperator calc = new CalcByTernaryOperator();

        System.out.println(calc.calculate(num));
    }
}
