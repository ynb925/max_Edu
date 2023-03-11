package com.serial;

import java.io.Serializable;

public class Body implements Serializable {

    private static final long serialVersionUID = 14376375L;
    private int height;
    private String name;

    public Body(int height, String name) {
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Body{" +
                "height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
