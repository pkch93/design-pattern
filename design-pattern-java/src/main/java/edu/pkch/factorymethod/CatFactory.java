package edu.pkch.factorymethod;

public class CatFactory extends AnimalFactory {

    @Override
    protected Animal createInternal(String name, int age) {
        return new Cat(name, age);
    }
}
