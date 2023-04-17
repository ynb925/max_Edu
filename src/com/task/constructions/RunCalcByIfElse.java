package com.task.constructions;

import java.util.Scanner;

public class RunCalcByIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CalcByIfElse calc = new CalcByIfElse();

        calc.calculate(num);
    }
}
