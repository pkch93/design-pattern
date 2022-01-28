package edu.pkch.bridge;

import java.util.List;

public abstract class Character {
    private final String name;
    private final List<Skill> skills;

    public Character(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public void useAllSkill() {
        skills.forEach(Skill::cast);
    }

    abstract public void introduce();
}
