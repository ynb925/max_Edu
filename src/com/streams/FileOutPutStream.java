package com.streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

/**
 * FileOutputStream
 * Створити клас Main з методом main в якому за допомогою класу FileOutputStream додати шлях до файлу у файловій системі ( text.txt )
 * Написати будь який текст текст і за допомогою методу write додати текст у вигляді байтів до файлу. Закрити стрім. Перевірити файл.
 */
public class FileOutPutStream {

    public static void main(String[] args) throws IOException {
        File path = Path.of("resources", "test.txt").toFile();

        try (FileOutputStream fileOut = new FileOutputStream(path)) {
            String contentText = "test text write to the file";
            fileOut.write(contentText.getBytes());
            System.out.println(contentText);
        }
    }
}