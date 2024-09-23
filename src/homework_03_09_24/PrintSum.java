package homework_03_09_24;

import java.util.Scanner;
public class PrintSum {
    public static void main(String[] args) {
        System.out.println("Input three floating-point numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your first number is: ");
        double number1 = scanner.nextDouble();
        System.out.print("Your second number is: ");
        double number2 = scanner.nextDouble();
        System.out.print("Your third number is: ");
        double number3 = scanner.nextDouble();
        double sumNumber =  number1 + number2 + number3;
        int sumWholeNumber = (int) sumNumber;
        System.out.println( "Sum whole number is: " + sumWholeNumber);
        double sumFraction = sumNumber - sumWholeNumber;
        System.out.println( "Sum fraction is: " + sumFraction);
        int wholeFirstNumber = (int) number1;
        int wholeSecondNumber = (int) number2;
        int wholeThirdNumber = (int) number3;
        int integerSum = wholeFirstNumber + wholeSecondNumber + wholeThirdNumber;
        System.out.println( "Sum of three whole numbers: " + integerSum);

    }
}