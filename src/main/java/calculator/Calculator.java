package calculator;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    int calculate(int a, String operator, int b) throws Exception {
        if (operator.equals("+")) {
            return add(a,b);
        }
        if (operator.equals("-")) {
            return subtract(a,b);
        }
        if (operator.equals("*")) {
            return multiply(a,b);
        }
        if (operator.equals("/")) {
            return divide(a,b);
        }

        throw new IllegalArgumentException("올바른 연산자가 아닙니다.");
    }
}
