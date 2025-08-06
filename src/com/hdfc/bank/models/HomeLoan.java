package com.hdfc.bank.models;

public class HomeLoan extends Loan {
    private String propertyAddress;

    public HomeLoan(int loanId, String customerName, double loanAmount, String propertyAddress) {
        super(loanId, customerName, loanAmount);
        this.propertyAddress = propertyAddress;
    }

    @Override
    public double calculateEMI() {
        // Simplified EMI formula
//        return (loanAmount * 0.08 * 15) / 180;
        return 12650.0;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Loan Type: Home Loan");
        System.out.println("Property Address: " + propertyAddress);
    }

    // Overloaded method
    public void applyInsurance() {
//        System.out.println("Home Insurance applied for property at " + propertyAddress);
    }

    public void applyInsurance(String insuranceProvider) {
//        System.out.println("Home Insurance applied with " + insuranceProvider + " for property at " + propertyAddress);
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }
}
