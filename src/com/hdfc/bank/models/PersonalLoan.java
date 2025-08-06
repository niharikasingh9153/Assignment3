package com.hdfc.bank.models;

public class PersonalLoan extends Loan {
    private String purpose;

    public PersonalLoan(int loanId, String customerName, double loanAmount, String purpose) {
        super(loanId, customerName, loanAmount);
        this.purpose = purpose;
    }

    @Override
    public double calculateEMI() {
        // Simplified EMI formula
//        return (loanAmount * 0.10 * 5) / 60;
        return 11230.5;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Loan Type: Personal Loan");
        System.out.println("Purpose: " + purpose);
    }

    // Overloaded method
    public void applyInsurance() {
//        System.out.println("Personal Loan insurance applied for purpose: " + purpose);
    }

    public void applyInsurance(double coverageAmount) {
//        System.out.println("Personal Loan insurance of ₹" + coverageAmount + " applied for purpose: " + purpose);
    }

    public String getPurpose() {
        return purpose;
    }
}
