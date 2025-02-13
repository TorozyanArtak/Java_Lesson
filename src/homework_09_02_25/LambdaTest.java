package homework_09_02_25;

public class LambdaTest {
    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> {
            if (b == 0) {
                throw new InvalidArgumentException("The divisor cannot be zero.");
            }
            return a / b;
        };
        try {
            System.out.println(addition.calculate(5.0,18.3));
            System.out.println(subtraction.calculate(45.1,15.2));
            System.out.println(multiplication.calculate(45.1,15.2));
            System.out.println(division.calculate(45.1,0));
        }catch (InvalidArgumentException e){
            System.out.println("Error:" + e.getMessage());
        }

    }
}
