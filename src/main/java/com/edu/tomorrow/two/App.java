package com.edu.tomorrow.two;

public class App {
    public static void main(String[] args) {
       CheckingAccount ca1 = new CheckingAccount();
       CheckingAccount ca2 = new CheckingAccount();
       CheckingAccount ca3 = new CheckingAccount();

       Bank bank = new Bank("John", ca1, "Mary", ca2, "Peter", ca3);

       bank.credit("John", 1000);
       bank.debit("Mary", 2000);
       bank.transfer("Peter", "John", 500);

       System.out.println("John's balance: " + bank.getBalance("John"));
       System.out.println("Mary's balance: " + bank.getBalance("Mary"));
       System.out.println("Peter's balance: " + bank.getBalance("Peter"));
    }
}
