package io_streams;

import java.io.*;
import java.nio.file.Path;

/**
 * FileInputStream
 * Створити клас Main з методом main в якому за допомогою класу FileInputStream додати шлях до файлу у файловій системі ( text.txt )
 * Написати будь який текст у файл і вивести його у консоль.
 */
public class Fis {
    public static void main(String[] args) throws IOException {
        File path = Path.of("resources", "test.txt").toFile();

        try (BufferedReader fRead = new BufferedReader(new FileReader(path))) {
            String read = fRead.readLine();
            System.out.println(read);
        }
    }
}
