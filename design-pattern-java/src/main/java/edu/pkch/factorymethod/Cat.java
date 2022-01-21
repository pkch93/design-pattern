package edu.pkch.factorymethod;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    protected void cry() {
        System.out.println("야옹");
    }
}
