package org.example.service;

import org.example.model.TuitionFeePayment;
import java.util.HashMap;
import java.util.Map;

public class TuitionServiceImpl implements ITuitionService {
    private Map<Integer, TuitionFeePayment> paymentMap = new HashMap<>();
    private final double RATE_PER_UNIT = 500.0;

    @Override
    public void calculateFee(int studentID, int units) {
        double totalFee = units * RATE_PER_UNIT;
        if (paymentMap.containsKey(studentID)) {
            paymentMap.get(studentID).setTotalFee(totalFee);
        } else {
            paymentMap.put(studentID, new TuitionFeePayment(studentID, totalFee));
        }
        System.out.println("Fee calculated: " + totalFee);
    }

    @Override
    public String makePayment(int studentID, double amount) {
        TuitionFeePayment payment = paymentMap.get(studentID);
        if (payment != null) {
            payment.addPayment(amount);
            return "Payment of " + amount + " received. Remaining: " + payment.getRemainingBalance();
        }
        return "Student not found in payment system. Calculate fee first.";
    }

    @Override
    public double getRemainingBalance(int studentID) {
        TuitionFeePayment payment = paymentMap.get(studentID);
        return (payment != null) ? payment.getRemainingBalance() : 0.0;
    }

    @Override
    public void displayPaymentInfo(int studentID) {
        TuitionFeePayment payment = paymentMap.get(studentID);
        if (payment != null) {
            System.out.println(payment);
        } else {
            System.out.println("No payment information for Student ID: " + studentID);
        }
    }
}
