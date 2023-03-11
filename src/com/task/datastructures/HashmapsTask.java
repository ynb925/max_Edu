package com.task.datastructures;

import java.util.HashMap;
import java.util.Map;

/**
 * Створити HashMap<String, Integer> в якому ключами будуть місяці а значеннями кількість днів.
 * Друга частина, знайти метод через документацію який дозволить дістати всі значення (Value) і вивести їх в консоль.
 * Третя частина замінити кількість днів місяця у лютому з 28 на 29, видалити літні місяці і вивести в консоль результат
 * (Через EntrySet метод і потім через for-each пройтись по всім ключам)
 */
public class HashmapsTask {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Jan", 30);
        map.put("Feb", 28);
        map.put("Apr", 31);
        map.put("May", 31);
        map.put("Jun", 31);
        map.put("Jul", 31);
        map.put("Aug", 31);
        map.put("Sep", 31);
        map.put("Oct", 31);
        map.put("Nov", 31);
        map.put("Dec", 31);

        for (Integer v : map.values()) {
            System.out.print(v + " ");
        }

        System.out.println("set 29");
        map.replace("Feb", 29);
        System.out.println(map + " ");

        System.out.println("remove summer");
        map.remove("Jun");
        map.remove("Jul");
        map.remove("Aug");
        System.out.println(map + " ");

        System.out.println("=======================================");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey());
        }

        System.out.println("======================");
        for (String key : map.keySet()) {
            System.out.print(key);
        }
    }
}
