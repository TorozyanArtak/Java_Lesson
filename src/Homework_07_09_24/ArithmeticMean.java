package Homework_07_09_24;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner Short = new Scanner(System.in);
        System.out.print("Enter first short number: ");
        short value1 = Short.nextShort();
        System.out.print("Enter second short number: ");
        short value2 = Short.nextShort();
        System.out.print("Enter third short number: ");
        short value3 = Short.nextShort();
        int mean = ((value1 + value2 + value3) / 3);
        if (mean == 0) {
            System.out.println("Division by zero is not allowed");
            System.exit(2);
        } else {
            System.out.println("The arithmetic mean of the above three numbers is equal to " + mean);
            int absolutSum;
            if (value1 > 0) {
                absolutSum = value1;
            } else {
                absolutSum = value1 * -1;
            }
            if (value2 > 0) {
                absolutSum += value2;
            } else {
                absolutSum += value2 * -1;
            }
            if (value3 > 0) {
                absolutSum += value3;
            } else {
                absolutSum += value3 * -1;

            }
            System.out.println("The result is " + (double) absolutSum / mean);

        }

    }
}