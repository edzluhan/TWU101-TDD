package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) throws IllegalArgumentException {

        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int result = 1;
        for (int index = 2; index <= i; index++) {
            result = result * index;
        }
        return result;
    }
}
