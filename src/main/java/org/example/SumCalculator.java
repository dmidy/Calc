package org.example;

public class SumCalculator {
    public int sum(int input) {

        if (input == 0) {
            throw new IllegalArgumentException("Error: input can`t be 0");
        }

        int total = 0;

        for (int i = 1; i <= input; i++) {
            total = total + i;
        }

        return total;
    }
}
