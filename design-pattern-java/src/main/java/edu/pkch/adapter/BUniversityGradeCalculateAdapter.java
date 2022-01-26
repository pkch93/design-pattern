package edu.pkch.adapter;

public class BUniversityGradeCalculateAdapter {
    private static final double CONVERSION_RATE = 4.5 / 4.3;

    private final GradeCalculator gradeCalculator;

    public BUniversityGradeCalculateAdapter(GradeCalculator gradeCalculator) {
        this.gradeCalculator = gradeCalculator;
    }

    public Grade calculate(double totalCredit) {
        double convertedTotalCredit = CONVERSION_RATE * totalCredit;

        return gradeCalculator.calculate(convertedTotalCredit);
    }
}
