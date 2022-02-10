package edu.pkch.command.earbuds.strategy;

public class ChickSoundStrategy implements FindEarBudSoundStrategy {

    @Override
    public void makeSound() {
        System.out.println("삐약삐약");
    }
}
