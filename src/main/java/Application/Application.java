package Application;

import Application.calculator.Calculator;

/**
 * Application's entry point, use it to demonstrate your code execution
 */
public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(2);
        double a = 10.1;
        double b = 6.3;
        double result = calculator.add(a, b);
        double result1 = calculator.div(a, b);
        double result2 = calculator.multiply(a, b);
        double result3 = calculator.subtract(a, b);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
