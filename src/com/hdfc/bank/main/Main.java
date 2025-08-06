package com.hdfc.bank.main;

import com.hdfc.bank.models.*;
import com.hdfc.bank.services.LoanService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Loan loan1 = new HomeLoan(101, "Ravi", 1500000, "MG Road, Bangalore");
        Loan loan2 = new PersonalLoan(102, "Neha", 500000, "Wedding Expenses");

        List<Loan> loanList = new ArrayList<>();
        loanList.add(loan1);
        loanList.add(loan2);

        LoanService service = new LoanService();

        for (Loan loan : loanList) {
            service.printEMIDetails(loan);  // Polymorphism in action
//            System.out.println("Implicit toString: " + loan); // toString implicit
//            System.out.println("Explicit toString: " + loan.toString()); // toString explicit
            System.out.println("--------------");
        }

        // Method Overloading demonstration
        ((HomeLoan)loan1).applyInsurance();
        ((HomeLoan)loan1).applyInsurance("Tata AIG");

        ((PersonalLoan)loan2).applyInsurance();
        ((PersonalLoan)loan2).applyInsurance(200000);
    }
}
