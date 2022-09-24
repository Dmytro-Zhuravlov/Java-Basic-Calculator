package Application.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    private int precision;
    public Calculator(int precision) {
        this.precision = precision;
    }

    public double add(double a, double b) {
        BigDecimal firstNumber = new BigDecimal(a);
        BigDecimal secondNumber = new BigDecimal(b);
        BigDecimal result = firstNumber.add(secondNumber);
        return result.setScale(precision, RoundingMode.CEILING).doubleValue();
    }

    public double subtract(double a, double b) {
        BigDecimal firstNumber = new BigDecimal(a);
        BigDecimal secondNumber = new BigDecimal(b);
        BigDecimal result = firstNumber.subtract(secondNumber);
        return result.setScale(precision, RoundingMode.CEILING).doubleValue();
    }

    public double multiply(double a, double b) {
        BigDecimal firstNumber = new BigDecimal(a);
        BigDecimal secondNumber = new BigDecimal(b);
        BigDecimal result = firstNumber.multiply(secondNumber);
        return result.setScale(precision, RoundingMode.CEILING).doubleValue();
    }

    public double div(double a, double b) {
        if(b == 0 && a >= 0) {
            return Double.POSITIVE_INFINITY;
        }
        if(b == 0 && a < 0) {
            return Double.NEGATIVE_INFINITY;
        }
        BigDecimal firstNumber = new BigDecimal(a);
        BigDecimal secondNumber = new BigDecimal(b);
        BigDecimal result = firstNumber.divide(secondNumber, RoundingMode.DOWN);
        return result.setScale(precision, RoundingMode.DOWN).doubleValue();
    }

}
