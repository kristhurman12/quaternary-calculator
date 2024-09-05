package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.quaternaryCalculator;

public class operations_test {
    @Test
    public void testAdd() {
        quaternaryCalculator calculator = new quaternaryCalculator();
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }
    @Test
    public void testSubtract() {
        quaternaryCalculator calculator = new quaternaryCalculator();
        int result = calculator.subtract(3, 2);
        assertEquals(1, result);
    }
    @Test
    public void testDivision() {
        quaternaryCalculator calculator = new quaternaryCalculator();
        int result = calculator.divide(4, 2);
        assertEquals(2, result);
    }
    @Test
    public void testMultiplication() {
        quaternaryCalculator calculator = new quaternaryCalculator();
        int result = calculator.multiply(1, 3);
        assertEquals(3, result);
    }

    @Test
    public void testSquare(){
        quaternaryCalculator calculator=new quaternaryCalculator();
        int result= calculator.square(4);
        assertEquals(16,result);
    }
    @Test
    public void testSquareRoot(){
        quaternaryCalculator calculator=new quaternaryCalculator();
        int result= calculator.squareRoot(16);
        assertEquals(4,result);
    }
    @Test
    public void testDecimalToQuaternary() {
        quaternaryCalculator calculator = new quaternaryCalculator();
        String result = calculator.decimalToQuaternary(10);
        assertEquals("22", result);
    }
    @Test
    public void testQuaternaryToDecimal() {
        quaternaryCalculator calculator = new quaternaryCalculator();
        int result = calculator.quaternaryToDecimal("22");  // 22 in quaternary is 10 in decimal
        assertEquals(10, result);
    }

}
