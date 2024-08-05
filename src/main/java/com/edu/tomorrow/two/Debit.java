package com.edu.tomorrow.two;

public class Debit extends Operation {
    public Debit(double value) {
        super(value);
    }

    @Override
    public double op() {
        return -super.getValue();
    }
}
