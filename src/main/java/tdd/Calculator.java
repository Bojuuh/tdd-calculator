package tdd;

import javax.xml.transform.Result;

public class Calculator {

    // calculator
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0){
            throw new ArithmeticException("Cant divide by zero");
        } else{
            return a / b;
        }
    }

    // calculator 2
    public int add(String numbers) {
        String[] numArray = numbers.split(",");
        int sum = 0;
        for (int i = 0; i < numArray.length; i++){
            sum += Integer.parseInt(numArray[i].trim());
        }
        return sum;
    }

    public int add(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
