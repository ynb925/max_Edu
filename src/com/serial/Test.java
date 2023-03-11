package com.serial;

import java.io.*;
import java.nio.file.Path;

public class Test {
    public static void main(String[] args) {
        Path path = Path.of("res", "serialObj.txt");

        serializeWriteObj(path);
        deSerializeReadObj(path);
    }

    private static void serializeWriteObj(Path path) {
        try (ObjectOutputStream outFile = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Body body1 = new Body(34, "First");
            outFile.writeObject(body1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deSerializeReadObj(Path path) {
        try (ObjectInputStream inFile = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object obj = inFile.readObject();
            System.out.println(obj);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

