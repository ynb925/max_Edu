package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Створити List<String> numbers за допомогою методу List.of додати в нього назви цифр словами (one, two, three..) від 0 до 9.
 * В наступній стрічці зробити стрім, знайти найдовше слово, використати .collect(Collectors.joining.. ) для отримання формату для прикладу “(t,w,o)”
 */
public class StreamApi3 {
    public static void main(String[] args) {
        List<String> list = List.of("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");

        String result = list.stream()
                .max(Comparator.comparing(String::length)).orElseThrow();

        String line = Arrays.stream(result.split(""))
                .collect(Collectors.joining(",", "(", ")"));

        System.out.println(line);
    }
}
