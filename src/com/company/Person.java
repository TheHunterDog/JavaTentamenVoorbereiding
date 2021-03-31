package com.company;

public class Person {
    private boolean strong;
    private String name;
    private int age;
    private float length;

    public Person(boolean strong, String name, int age, float length) {
        this.strong = strong;
        this.name = name;
        this.age = age;
        this.length = length;
    }

    public boolean isStrong() {
        return strong;
    }

    public void setStrong(boolean strong) {
        this.strong = strong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
