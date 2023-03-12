package com.task.constructions;

/**
 * Умовна конструкція з тернарним оператором:
 * Створити у класі Calculator метод calculateTernary(int number)
 * який повинен робити те ж саме що метод calculate але при
 * цьому використовувати тернарний умовний оператор.
 * Приклад: 1 - “Odd number: 1”, 2 - “Even number: 2”.
 */

public class CalcByTernaryOperator {

       public   String calculate(int number) {
        return number % 2 == 0 ? number + " - Even number" : number + " - Odd number";
    }
}
