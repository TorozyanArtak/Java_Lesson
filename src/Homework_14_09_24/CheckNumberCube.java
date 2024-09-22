package Homework_14_09_24;

import java.util.Scanner;

public class CheckNumberCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your number is: ");
        int number = scanner.nextInt();
        boolean result = false;
        boolean isPositive = true;
        if (number < 0) {
            isPositive = false;
            number *= -1;
        }
        for (int i = 0; i * i * i <= number; i++) {
            if (i * i * i == number) {
                if (isPositive) {
                    System.out.println("Number " + number + " is the cube of " + i);
                } else {
                    System.out.println("Number " + number * -1 + " is the cube of " + i * -1);
                }
                result = true;
                break;
            }
        }

        if (!result)
            System.out.println("Inputted number is not the cube of any number");
    }
}

