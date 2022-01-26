package edu.pkch.adapter;

public enum Grade {
    A_PLUS("A+"), A("A"),
    B_PLUS("B+"), B("B"),
    C_PLUS("C+"), C("C"),
    D_PLUS("D+"), D("D"),
    F("F");

    private String grade;

    Grade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}
