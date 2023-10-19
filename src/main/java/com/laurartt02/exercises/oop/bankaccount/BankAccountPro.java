package com.laurartt02.exercises.oop.bankaccount;

public abstract class BankAccountPro extends AbstractBankAccount {
    public BankAccountPro(String IBAN, double balance) {
        super(IBAN,balance,1,0.02);
    }
    public void deposit(double amount) {
        applyFee();
        super.deposit(amount);
    }

    public double withdraw(double amount) {
        applyFee();
        return super.withdraw(amount);
    }

}
