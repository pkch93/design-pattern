package edu.pkch.bridge;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Character {

    private Knight(String name, List<Skill> skills) {
        super(name, skills);
    }

    public static Knight of(String name) {
        return new Knight(name, List.of(new PowerAttack(), new PowerUp()));
    }

    @Override
    public void introduce() {
        System.out.println("i am knight");
    }
}
