package com.streamsapi;

import java.util.List;
import java.util.stream.Collectors;


/**
 * Створити List<String> numbers за допомогою методу List.of додати в нього назви цифр словами (one, two, three..) від 0 до 9.
 * В наступній стрічці зробити стрім, конвертувати в числа за допомогою приватного методу convertToNumber який буде приймати слово і повертати цифру,
 * можна використати switch, бажано нову версію Java 17.
 * Потім в тому ж стрімі викликати метод collect та в ньому метод summingInt щоб порахувати суму чисел.
 */
public class StreamApi2 {

    public static void main(String[] args) {
        Integer sum = List.of("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine").stream()
                .collect(Collectors.summingInt(StreamApi2::convertToNumber));

        System.out.println(sum);
    }

    private static Integer convertToNumber(String s) {
        switch (s) {
            case "zero":
                return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            default:
                throw new IllegalArgumentException();
        }
    }
}
