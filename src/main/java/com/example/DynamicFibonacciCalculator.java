package com.example;

// Time complexity: O(n)
// Space complexity: O(n)

import java.util.HashMap;
import java.util.Map;

public class DynamicFibonacciCalculator implements FibonacciCalculator {
    private final Map<Integer, Long> memo = new HashMap<>();

    @Override
    public long calculate(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        long result = calculate(n - 1) + calculate(n - 2);
        memo.put(n, result);
        return result;
    }
}