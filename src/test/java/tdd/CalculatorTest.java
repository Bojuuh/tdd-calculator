package tdd;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    // Calculator 1
    @Test
    @DisplayName("add test")
    void testAddition(){
        int a = 10;
        int b = 5;
        int expected = 15;
        int actual = calculator.add(a, b);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("subtract test")
    void testSubtraction(){
        int a = 10;
        int b = 5;
        int expected = 5;
        int actual = calculator.subtract(a,b);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("multiply test")
    void testMultiplication(){
        int a = 10;
        int b = 5;
        int expected = 50;
        int actual = calculator.multiply(a,b);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("divide test")
    void testDivision(){
        int a = 10;
        int b = 5;
        int expected = 2;
        int actual = calculator.divide(a,b);
        assertEquals(expected, actual);
    }

    // Calculator 2
    @Test
    @DisplayName("add with string input test")
    void testAddStringInput(){
        String input = "1, 2, 3";
        int expected = 6;
        int actual = calculator.add(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("add with number array as input test")
    void testAddNumArrayInput(){
        int[] numbers = {1, 2, 3};
        int expected = 6;
        int actual = calculator.add(numbers);
        assertEquals(expected, actual);
    }
}