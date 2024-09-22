package Homework_03_09_24;

import java.util.Scanner;
public class PrintNumberDigits {
    public static void main(String[] args) {
        System.out.println("Input Integer with 4 digits length");
        Scanner Integer = new Scanner(System.in);
        System.out.print("Your number is: " );
        int number = Integer.nextInt();
        int firstDigit = ( number / 1000 );
        int secondDigit = ( number % 1000 / 100 );
        int thirdDigit = ( number % 100 / 10 );
        int forthDigit = ( number % 10 );
        System.out.println( "First digit in number is " + firstDigit);
        System.out.println( "Second digit in number is " + secondDigit);
        System.out.println( "Third digit in number is " + thirdDigit);
        System.out.println( "Forth digit in number is " + forthDigit);


    }
}
