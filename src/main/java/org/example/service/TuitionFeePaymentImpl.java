package org.example.service;

import org.example.model.TuitionPayment;
import java.util.HashMap;
import java.util.Map;

public class TuitionFeePaymentImpl implements TuitionFeePayment {
    private Map<Integer, TuitionPayment> paymentMap = new HashMap<>();
    private final double RATE_PER_UNIT = 500.0; // Sample rate

    @Override
    public void calculateFee(int studentID, int units) {
        double totalFee = units * RATE_PER_UNIT;
        if (paymentMap.containsKey(studentID)) {
            paymentMap.get(studentID).setTotalFee(totalFee);
        } else {
            paymentMap.put(studentID, new TuitionPayment(studentID, totalFee));
        }
        System.out.println("Fee calculated: " + totalFee);
    }

    @Override
    public String makePayment(int studentID, double amount) {
        TuitionPayment payment = paymentMap.get(studentID);
        if (payment != null) {
            payment.addPayment(amount);
            return "Payment of " + amount + " received. Remaining: " + payment.getRemainingBalance();
        }
        return "Student not found in payment system. Calculate fee first.";
    }

    @Override
    public double getRemainingBalance(int studentID) {
        TuitionPayment payment = paymentMap.get(studentID);
        return (payment != null) ? payment.getRemainingBalance() : 0.0;
    }

    @Override
    public void displayPaymentInfo(int studentID) {
        TuitionPayment payment = paymentMap.get(studentID);
        if (payment != null) {
            System.out.println(payment);
        } else {
            System.out.println("No payment information for Student ID: " + studentID);
        }
    }
}
