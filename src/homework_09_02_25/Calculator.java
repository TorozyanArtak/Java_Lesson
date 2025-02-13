package homework_09_02_25;

@FunctionalInterface
public interface Calculator {
    public double calculate(double a, double b) throws InvalidArgumentException;
}
