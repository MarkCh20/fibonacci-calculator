package com.example;
// Time complexity: O(n)
// Space complexity: O(1)

public class IterativeFibonacciCalculator implements FibonacciCalculator {
    @Override
    public long calculate(int n) {
        if (n <= 1) return n;
        long prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            long temp = curr;
            curr = curr + prev;
            prev = temp;
        }
        return curr;
    }
}
