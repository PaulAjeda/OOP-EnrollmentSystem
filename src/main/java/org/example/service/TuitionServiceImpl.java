package org.example.service;

import org.example.model.TuitionFeePayment;
import org.example.exception.*;
import java.util.HashMap;
import java.util.Map;

public class TuitionServiceImpl implements ITuitionService {
    private Map<Integer, TuitionFeePayment> paymentMap = new HashMap<>();
    private final double RATE_PER_UNIT = 500.0;

    @Override
    public void calculateFee(int studentID, int units) throws EnrollmentException {
        if (units <= 0) throw new InvalidInputException("Academic units must be positive.");
        
        double totalFee = units * RATE_PER_UNIT;
        if (paymentMap.containsKey(studentID)) {
            paymentMap.get(studentID).setTotalFee(totalFee);
        } else {
            paymentMap.put(studentID, new TuitionFeePayment(studentID, totalFee));
        }
        System.out.println("Fee calculated: " + totalFee);
    }

    @Override
    public String makePayment(int studentID, double amount) throws EnrollmentException {
        if (amount <= 0) throw new InvalidInputException("Payment amount must be positive.");
        
        TuitionFeePayment payment = paymentMap.get(studentID);
        if (payment != null) {
            payment.addPayment(amount);
            return "Payment of " + amount + " received. Remaining: " + payment.getRemainingBalance();
        }
        throw new RecordNotFoundException("Student with ID " + studentID + " not found in payment system. Calculate fee first.");
    }

    @Override
    public double getRemainingBalance(int studentID) throws EnrollmentException {
        TuitionFeePayment payment = paymentMap.get(studentID);
        if (payment == null) throw new RecordNotFoundException("No payment records found for Student ID " + studentID);
        return payment.getRemainingBalance();
    }

    @Override
    public void displayPaymentInfo(int studentID) throws EnrollmentException {
        TuitionFeePayment payment = paymentMap.get(studentID);
        if (payment != null) {
            System.out.println(payment);
        } else {
            throw new RecordNotFoundException("No payment information for Student ID: " + studentID);
        }
    }
}
