package com.edu.tomorrow.two;

public abstract class Operation {
    private final double value;

    public Operation(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public abstract double op();
}
