package edu.pkch.chain;

public class Input {
    private final String name;
    private final int age;
    private final boolean married;

    public Input(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }
}
