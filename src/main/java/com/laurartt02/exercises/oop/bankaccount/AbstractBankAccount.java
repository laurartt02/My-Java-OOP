package com.laurartt02.exercises.oop.bankaccount;

public abstract class AbstractBankAccount implements BankAccount {
    protected String IBAN;
    protected double balance;
    protected double interestRate;
    protected double operationFee;
    public AbstractBankAccount(String IBAN, double balance, double interestRate, double operationFee) {
        this.balance = balance;
        this.interestRate = interestRate;
        setIBAN(IBAN);
        setOperationFee(operationFee);
    }

    @Override
    public String getIBAN() {
        return IBAN;
    }

    @Override
    public void setIBAN(String IBAN) {
        checkIBAN(IBAN);
        this.IBAN = IBAN;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getOperationFee() {
        return operationFee;
    }

    @Override
    public void setOperationFee(double operationFee) {
        if (operationFee < 0.0) {
            throw new IllegalArgumentException("Invalid negative fee");
        }
        this.operationFee = operationFee;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        balance -= amount;
        return amount;
    }

    @Override
    public void addInterest() {
        balance += balance * interestRate;
    }

    protected void applyFee() {
        balance -= operationFee;
    }

    protected void checkIBAN(String IBAN) {
        if (IBAN.length() < 8 || IBAN.length() > 34) {
            throw new IllegalArgumentException("Invalid length");
        }
        String countryCode = IBAN.substring(0, 2);
        if (!(Character.isUpperCase(countryCode.charAt(0)) && Character.isUpperCase(countryCode.charAt(1)))) {
            throw new IllegalArgumentException("Invalid country code");
        }
    }
}
