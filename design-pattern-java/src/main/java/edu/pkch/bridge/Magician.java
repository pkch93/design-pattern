package edu.pkch.bridge;

import java.util.List;

public class Magician extends Character {
    private Magician(String name, List<Skill> skills) {
        super(name, skills);
    }

    public static Magician of(String name) {
        return new Magician(name, List.of(new MagicClaw(), new ThunderBolt()));
    }

    @Override
    public void introduce() {
        System.out.println("i am magician");
    }
}
