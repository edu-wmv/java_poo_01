package com.edu.tomorrow.two;

public class AccountHolder {
    private final String name;
    private final CheckingAccount account;

    public AccountHolder(String name) {
        this.name = name;
        this.account = new CheckingAccount();
    }

    public String getName() {
        return this.name;
    }

    public CheckingAccount getAccount() {
        return this.account;
    }

}
