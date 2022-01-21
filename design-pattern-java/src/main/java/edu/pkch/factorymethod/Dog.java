package edu.pkch.factorymethod;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    protected void cry() {
        System.out.println("멍멍");
    }
}
