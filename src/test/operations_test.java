package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.Calculator;

public class operations_test {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(3, 2);
        assertEquals(1, result);
    }
    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(4, 2);
        assertEquals(2, result);
    }
    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(1, 3);
        assertEquals(3, result);
    }
}
