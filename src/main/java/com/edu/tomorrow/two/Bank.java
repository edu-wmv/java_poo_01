package com.edu.tomorrow.two;

public class Bank {
    AccountHolder ac1, ac2, ac3;

    public Bank(String name1, String name2, String name3) {
        ac1 = new AccountHolder(name1);
        ac2 = new AccountHolder(name2);
        ac3 = new AccountHolder(name3);
    }

    public AccountHolder getAccountHolder(String name) {
        if (ac1.getName().equals(name)) {
            return ac1;
        } else if (ac2.getName().equals(name)) {
            return ac2;
        } else if (ac3.getName().equals(name)) {
            return ac3;
        } else {
            return null;
        }
    }

    public void debit(String name, double value) {
        Debit d = new Debit(value);
        getAccountHolder(name).getAccount().execute(d);
    }

    public void credit(String name, double value) {
        Credit c = new Credit(value);
        getAccountHolder(name).getAccount().execute(c);
    }

    public double getBalance(String name) {
        return getAccountHolder(name).getAccount().getBalance();
    }

    public void transfer(String originName, String targetName, double value) {
        debit(originName, value);
        credit(targetName, value);
    }
}
