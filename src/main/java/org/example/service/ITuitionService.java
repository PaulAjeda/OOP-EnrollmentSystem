package org.example.service;

public interface ITuitionService {
    void calculateFee(int studentID, int units);
    String makePayment(int studentID, double amount);
    double getRemainingBalance(int studentID);
    void displayPaymentInfo(int studentID);
}
