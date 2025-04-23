package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlgorithmsTimeComplexityTest {

    private static final int N = 40;

    private FibonacciCalculator iterativeCalc;
    private FibonacciCalculator dynamicCalc;
    private FibonacciCalculator recursiveCalc;

    @BeforeEach
    void setUp() {
        iterativeCalc = new IterativeFibonacciCalculator();
        dynamicCalc = new DynamicFibonacciCalculator();
        recursiveCalc = new RecursiveFibonacciCalculator();
    }

    @Test
    void givenLargeInput_whenCalculateIteratively_thenPrintExecutionTime() {
        long start = System.nanoTime();
        long result = iterativeCalc.calculate(N);
        long duration = System.nanoTime() - start;

        System.out.printf("Iterative: result=%d, duration=%,d ns (%d ms)%n", result, duration, duration / 1_000_000);
    }

    @Test
    void givenLargeInput_whenCalculateDynamically_thenPrintExecutionTime() {
        long start = System.nanoTime();
        long result = dynamicCalc.calculate(N);
        long duration = System.nanoTime() - start;

        System.out.printf("Dynamic: result=%d, duration=%,d ns (%d ms)%n", result, duration, duration / 1_000_000);
    }

    @Test
    void givenLargeInput_whenCalculateRecursively_thenPrintExecutionTime() {
        long start = System.nanoTime();
        long result = recursiveCalc.calculate(N);
        long duration = System.nanoTime() - start;

        System.out.printf("Recursive: result=%d, duration=%,d ns (%d ms)%n", result, duration, duration / 1_000_000);
    }
}
