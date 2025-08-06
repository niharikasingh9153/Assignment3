package com.hdfc.bank.services;

import com.hdfc.bank.models.HomeLoan;
import com.hdfc.bank.models.Loan;
import com.hdfc.bank.models.PersonalLoan;

public class LoanService {

    // This method demonstrates polymorphism (dynamic dispatch)
    public void printEMIDetails(Loan loan) {
        // Print in sample output format
        System.out.println(
                "Loan ID: " + loan.getLoanId() +
                        " | Customer: " + loan.customerName +
                        " | Type: " + loan.getClass().getSimpleName() +
                        " | EMI: " + loan.calculateEMI()
        );

        // Downcasting using instanceof to access subclass-specific fields
        if (loan instanceof HomeLoan) {
            HomeLoan hl = (HomeLoan) loan;
            System.out.println("→ Property Address: " + hl.getPropertyAddress());
        } else if (loan instanceof PersonalLoan) {
            PersonalLoan pl = (PersonalLoan) loan;
            System.out.println("→ Purpose: " + pl.getPurpose());
        }

        System.out.println(); // Add spacing between entries
    }
}
