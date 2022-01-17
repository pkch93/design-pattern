package edu.pkch.factory;

public class Employee {
    private final String name;
    private final int age;
    private final int career;
    private final Position position;
    private final Gender gender;

    public Employee(String name, int age, int career, Position position, Gender gender) {
        this.name = name;
        this.age = age;
        this.career = career;
        this.position = position;
        this.gender = gender;
    }

    enum Position {
        SALES("영업"),
        DEVELOPMENT("개발"),
        MARKETING("마케팅"),
        DESIGN("디자인");

        private final String description;

        Position(String description) {
            this.description = description;
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
