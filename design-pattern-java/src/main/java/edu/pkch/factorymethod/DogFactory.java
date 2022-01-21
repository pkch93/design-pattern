package edu.pkch.factorymethod;

public class DogFactory extends AnimalFactory {

    @Override
    protected Animal createInternal(String name, int age) {
        return new Dog(name, age);
    }
}
