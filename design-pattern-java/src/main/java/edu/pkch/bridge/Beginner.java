package edu.pkch.bridge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Beginner extends Character {
    private Beginner(String name, List<Skill> skills) {
        super(name, skills);
    }

    public static Beginner of(String name) {
        return new Beginner(name, Collections.emptyList());
    }

    @Override
    public void introduce() {
        System.out.println("i am beginner");
    }
}
