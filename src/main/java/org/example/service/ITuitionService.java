package org.example.service;

import org.example.exception.EnrollmentException;

public interface ITuitionService {
    void calculateFee(int studentID, int units) throws EnrollmentException;
    String makePayment(int studentID, double amount) throws EnrollmentException;
    double getRemainingBalance(int studentID) throws EnrollmentException;
    void displayPaymentInfo(int studentID) throws EnrollmentException;
}
