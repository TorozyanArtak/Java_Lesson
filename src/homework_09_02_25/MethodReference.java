package homework_09_02_25;

public class MethodReference {


    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) throws InvalidArgumentException {
        if (b == 0) {
            throw new InvalidArgumentException("The divisor cannot be zero.");
        }
        return a / b;
    }
}
