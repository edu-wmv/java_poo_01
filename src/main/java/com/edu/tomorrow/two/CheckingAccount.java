package com.edu.tomorrow.two;

public class CheckingAccount {
    private double balance;

    public CheckingAccount() {
        this.balance = 0;
    }

    public void execute(Operation operation) {
        this.balance += operation.op();
    }

    public double getBalance() {
        return this.balance;
    }
}
