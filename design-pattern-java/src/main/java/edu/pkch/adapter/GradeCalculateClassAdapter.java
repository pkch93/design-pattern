package edu.pkch.adapter;

public class GradeCalculateClassAdapter extends GradeCalculator {
    private static final double CONVERSION_RATE = 4.5 / 4.3;

    @Override
    public Grade calculate(double totalCredit) {
        double convertedTotalCredit = totalCredit * CONVERSION_RATE;
        return super.calculate(totalCredit);
    }
}
