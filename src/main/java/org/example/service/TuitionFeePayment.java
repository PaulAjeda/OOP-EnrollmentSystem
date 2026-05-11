package org.example.service;

public interface TuitionFeePayment {
    void calculateFee(int studentID, int units);
    String makePayment(int studentID, double amount);
    double getRemainingBalance(int studentID);
    void displayPaymentInfo(int studentID);
}
