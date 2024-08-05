package com.edu.tomorrow.two;

public class App {
    public static void main(String[] args) {
       Bank bank = new Bank("John", "Mary", "Peter");

       bank.credit("John", 1000);
       bank.debit("Mary", 2000);
       bank.transfer("Peter", "John", 500);

       System.out.println("John's balance: " + bank.getBalance("John"));
       System.out.println("Mary's balance: " + bank.getBalance("Mary"));
       System.out.println("Peter's balance: " + bank.getBalance("Peter"));
    }
}
