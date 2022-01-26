package edu.pkch.adapter;

public class GradeCalculator {

    public Grade calculate(double totalCredit) {
        if (totalCredit >= 4.5) {
            return Grade.A_PLUS;
        } else if (totalCredit >= 4) {
            return Grade.A;
        } else if (totalCredit >= 3.5) {
            return Grade.B_PLUS;
        } else if (totalCredit >= 3) {
            return Grade.B;
        } else if (totalCredit >= 2.5) {
            return Grade.C_PLUS;
        } else if (totalCredit >= 2) {
            return Grade.C;
        } else if (totalCredit >= 1.5) {
            return Grade.D_PLUS;
        } else if (totalCredit >= 1.0) {
            return Grade.D;
        }
        return Grade.F;
    }
}
