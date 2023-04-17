package com.task.constructions;

import java.util.Scanner;

public class RunCalcBySwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CalcBySwitch calc = new CalcBySwitch();

        calc.calculate(num);
    }
}
