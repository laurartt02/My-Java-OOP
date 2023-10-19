package com.laurartt02.exercises.oop.bankaccount;

/**
 * Defines common features of bank accounts.
 */
public interface BankAccount {
    public void addInterest();
    public void deposit(double amount);
    public double getBalance();
    public String getIBAN();
    public double getInterestRate();
    public double getOperationFee();
    public void setBalance(double balance);
    public void setIBAN(String IBAN);
    public void setInterestRate(double interestRate);
    public void setOperationFee(double operationFee);
    public double transfer(BankAccount other, double amount);
    public double withdraw(double amount);
}
