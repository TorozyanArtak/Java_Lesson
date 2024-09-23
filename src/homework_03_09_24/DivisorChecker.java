package homework_03_09_24;

import java.util.Scanner;
public class DivisorChecker {
    public static void main(String[] args) {
        Scanner Integer = new Scanner(System.in);
        System.out.print( "Input your first Integer number: ");
        int num1 = Integer.nextInt();
        System.out.print( "Input your second Integer number: ");
        int num2 = Integer.nextInt();
        boolean isDivisible = num1 % num2 == 0;
        System.out.println("Result is " + isDivisible );


    }

    public static class CheckAndPrintCapitalLetter {
        public static void main(String[] args) {
            Scanner Font = new Scanner(System.in);
            System.out.print("Input your small letter: ");
            char smallLetter = Font.next().charAt(0);
            if (smallLetter > 96 && smallLetter < 123) {
                char capitalLetter = (char) (smallLetter - 32);
                System.out.println("Capital letter of your inputted small letter is " + capitalLetter);
            } else {
                System.out.println(smallLetter + " is not English alphabet small letter");
                System.exit(2);
            }

        }
    }
}
