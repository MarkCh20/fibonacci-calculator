package com.example;

public class RecursiveFibonacciCalculator implements FibonacciCalculator {
    @Override
    public long calculate(int n) {
        // Time complexity: O(2ⁿ)
        // Space complexity: O(n)

        if (n <= 1) {
            return n;
        }

        return calculate(n - 1) + calculate(n - 2);
    }
}
