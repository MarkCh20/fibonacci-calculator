package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciCalculatorTest {

    private FibonacciCalculator iterativeCalc;
    private FibonacciCalculator recursiveCalc;
    private FibonacciCalculator dynamicCalc;

    @BeforeEach
    void setUp() {
        iterativeCalc = new IterativeFibonacciCalculator();
        recursiveCalc = new RecursiveFibonacciCalculator();
        dynamicCalc = new DynamicFibonacciCalculator();
    }

    // Iterative tests
    @Test
    void givenZero_whenCalculateIteratively_thenReturnZero() {
        // Given
        int input = 0;

        // When
        long actualResult = iterativeCalc.calculate(input);

        // Then
        long expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenOne_whenCalculateIteratively_thenReturnOne() {
        // Given
        int input = 1;

        //When
        long actualResult = iterativeCalc.calculate(input);

        // Then
        long expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenSix_whenCalculateIteratively_thenReturnEight() {
        // Given
        int input = 6;

        //When
        long actualResult = iterativeCalc.calculate(input);

        // Then
        long expectedResult = 8;
        assertEquals(expectedResult, actualResult);
    }


    // Recursive tests
    @Test
    void givenZero_whenCalculateRecursively_thenReturnZero() {
        // Given
        int input = 0;

        // When
        long actualResult = recursiveCalc.calculate(input);

        // Then
        long expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenOne_whenCalculateRecursively_thenReturnOne() {
        // Given
        int input = 1;

        // When
        long actualResult = recursiveCalc.calculate(input);

        // Then
        long expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenSix_whenCalculateRecursively_thenReturnEight() {
        // Given
        int input = 6;

        // When
        long actualResult = recursiveCalc.calculate(input);

        // Then
        long expectedResult = 8;
        assertEquals(expectedResult, actualResult);
    }

    // Dynamic tests
    @Test
    void givenZero_whenCalculateDynamically_thenReturnZero() {
        // Given
        int input = 0;

        // When
        long actualResult = dynamicCalc.calculate(input);

        // Then
        long expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenOne_whenCalculateDynamically_thenReturnOne() {
        // Given
        int input = 1;

        // When
        long actualResult = dynamicCalc.calculate(input);

        // Then
        long expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenSix_whenCalculateDynamically_thenReturnEight() {
        // Given
        int input = 6;

        // When
        long actualResult = dynamicCalc.calculate(input);

        // Then
        long expectedResult = 8;
        assertEquals(expectedResult, actualResult);
    }
}