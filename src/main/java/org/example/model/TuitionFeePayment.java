package org.example.model;

public class TuitionFeePayment {
    private int studentID;
    private double totalFee;
    private double paidAmount;

    public TuitionFeePayment(int studentID, double totalFee) {
        this.studentID = studentID;
        this.totalFee = totalFee;
        this.paidAmount = 0.0;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void addPayment(double amount) {
        this.paidAmount += amount;
    }

    public double getRemainingBalance() {
        return totalFee - paidAmount;
    }

    @Override
    public String toString() {
        return "TuitionFeePayment{" +
                "studentID=" + studentID +
                ", totalFee=" + totalFee +
                ", paidAmount=" + paidAmount +
                ", remainingBalance=" + getRemainingBalance() +
                '}';
    }
}
