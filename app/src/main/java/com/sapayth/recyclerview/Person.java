package com.sapayth.recyclerview;

public class Person {
    private String name;
    private int age;
    private int imageResourceId;

    public Person(String name, int age, int imageResourceId) {
        this.name = name;
        this.age = age;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
