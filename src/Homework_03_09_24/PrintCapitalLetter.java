package Homework_03_09_24;

import java.util.Scanner;
public class PrintCapitalLetter {
    public static void main(String[] args) {
        Scanner Font = new Scanner(System.in);
        System.out.print( "Input your small letter: ");
        char smallLetter = Font.next().charAt(0);
        char capitalLetter = (char) (smallLetter - 32);
        System.out.println( "Capital letter of your inputted small letter is " + capitalLetter );

    }

}
