package main;

public class quaternaryCalculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int divide(int num1, int num2) throws ArithmeticException {
        if(num2==0){
            throw new ArithmeticException("Division By Zero is not allowed :(");
        }
        return num1 / num2;
    }
    public int square(int num){
        return num*num;
    }
    public int squareRoot(int num){
        return (int) Math.sqrt(num);
    }


    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Quaternary to Decimal Conversion
    public int quaternaryToDecimal(String quaternary) {
        int decimal = 0;
        for (int i = 0; i < quaternary.length(); i++) {
            decimal = decimal * 4 + (quaternary.charAt(i) - '0');
        }
        return decimal;
    }

    // Decimal to Quaternary Conversion
    public String decimalToQuaternary(int decimal) {
        StringBuilder quaternary = new StringBuilder();
        if (decimal == 0) {
            return "0";
        }
        while (decimal > 0) {
            quaternary.insert(0, decimal % 4);
            decimal /= 4;
        }
        return quaternary.toString();
    }
    public String displayToggle(String quarternary, Boolean toDecimal){
        if(toDecimal){
            return String.valueOf(quaternaryToDecimal(quarternary));
        }else {
            return decimalToQuaternary(Integer.parseInt(quarternary));
        }
    }

}
