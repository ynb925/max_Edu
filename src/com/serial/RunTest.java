package com.serial;

import java.nio.file.Path;

public class RunTest {

    public static void main(String[] args) {
        Body body = new Body(34, "johnny");
        Test test = new Test(Path.of("res", "serialObj.txt"));

        test.serializeWriteObj(body);
        test.deSerializeReadObj();
    }
}
