package junit.class02;

public class Division {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero.");
        }

        return a / b;
    }
}
