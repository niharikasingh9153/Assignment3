package com.hdfc.bank.models;

public abstract class Loan {
    public static final String BANK_NAME = "HDFC Life";

    private final int loanId;
    public String customerName;
    protected double loanAmount;

    public Loan(int loanId, String customerName, double loanAmount) {
        this.loanId = loanId;
        this.customerName = customerName;
        this.loanAmount = loanAmount;
    }

    public final int getLoanId() {
        return loanId;
    }

    public abstract double calculateEMI();

    public void printDetails() {
        System.out.println("Loan ID: " + loanId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Bank Name: " + BANK_NAME);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", customerName='" + customerName + '\'' +
                ", loanAmount=" + loanAmount +
                '}';
    }
}
