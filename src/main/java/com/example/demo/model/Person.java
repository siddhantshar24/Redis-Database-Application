package com.example.demo.model;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String id;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
