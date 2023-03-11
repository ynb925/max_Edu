package com.streamsapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Створити List<String> за допомогою методу Stream.of і наповнити його днями неділі, Sunday, Monday...
 * Потім в цьому ж стрімі відфільтрувати його по довжині слова щоб розмір назви дня був не довший ніж 7 символів включно,
 * далі додати до кожної назви дня слово "First " з пробілом, далі зібрати все у список за допомогою методу collect.
 * У методі main використати метод forEach для створеного списку
 * І вивести у консоль каожний напис.
 */
public class StreamApi1 {

    public static void main(String[] args) {
        List<String> weekDays = Stream.of("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
                .filter(x -> x.length() <= 7)
                .map(day -> "First " + day)
                .collect(Collectors.toList());

        weekDays.forEach(System.out::println);
    }
}
