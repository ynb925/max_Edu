package com.serial;

import java.io.*;
import java.nio.file.Path;

public class Test {

    private final Path path;

    public Test(Path path) {
        this.path = path;
    }

    public void serializeWriteObj(Body body) {
        try (ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            fileOut.writeObject(body);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Body deSerializeReadObj() {
        try (ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Body body = (Body) fileIn.readObject();
            System.out.println(body);

            return body;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

