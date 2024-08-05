package com.edu.tomorrow.two;

public class Credit extends Operation {
    public Credit(double value) {
        super(value);
    }

    @Override
    public double op() {
        return super.getValue();
    }
}
