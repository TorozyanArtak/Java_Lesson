package homework_09_02_25;

public class MethodReferenceTest {
    public static void main(String[] args) {


        Calculator addition = MethodReference::add;
        Calculator subtraction = MethodReference::subtract;
        Calculator multiplication = MethodReference::multiply;
        Calculator division = MethodReference::divide;

        try {
            System.out.println(addition.calculate(18.0,22.3));
            System.out.println(subtraction.calculate(869.1,26.0));
            System.out.println(multiplication.calculate(-5.1,15.2));
            System.out.println(division.calculate(16.1,0));
        }catch (InvalidArgumentException e){
            System.out.println("Error:" + e.getMessage());
        }


    }
}
