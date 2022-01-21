package edu.pkch.factorymethod;

public abstract class AnimalFactory {

    public Animal create(String name) {
        int age = 1;
        return createInternal(name, age);
    }

    abstract protected Animal createInternal(String name, int age);
}
