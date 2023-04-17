package com.task.constructions;

/**
 * Умовна конструкція switch:
 * У клас Calculator додати метод calculateSwitch(int number) який буде
 * всередині використовувати конструкцію switch і в залежності від того
 * яка цифра прийде у метод, потрібно виводити різні повідомлення у консоль.
 * Приклад:  1 - "turn on", 2 - "pause", 3 - turn down".
 */

public class CalcBySwitch {

       public void calculate(int num) {
        switch (num) {
            case 1:
                System.out.println(" 1 - turn on ");
                break;
            case 2:
                System.out.println(" 2 - pause ");
                break;
            case 3:
                System.out.println(" 3 - turn down ");
                break;
            default:
                System.out.println("enter anyone 1, 2, 3 num");
        }
    }
}
