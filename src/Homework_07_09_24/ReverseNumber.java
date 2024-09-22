package Homework_07_09_24;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Input Integer with 3 digits length");
        Scanner Integer = new Scanner(System.in);
        System.out.print("Your number is: ");
        int number = Integer.nextInt();
        if (number > 99 && number < 1000)  {
            int firstDigit = (number / 100);
            int secondDigit = (number % 100 / 10);
            int thirdDigit = (number % 10);
            if (thirdDigit != 0) {
                int newThreeDigits = thirdDigit * 100 + secondDigit * 10 + firstDigit;
                System.out.println("Reversed number is " + newThreeDigits);
            } else {
                System.out.println("Impossible to get valid tree digits number by reversing the following number: "+ number);
                System.exit(2);
            }
        } else {
            System.out.println(number + " isn't positive three digits number");
            System.exit(2);
        }

    }
}
