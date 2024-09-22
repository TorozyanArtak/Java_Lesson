package Homework_11_09_24;

import java.util.Scanner;

public class ArrayMiddleAssigner {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Input array size: ");
        int length = Scanner.nextInt();
        if (length < 1 || length > 8) {
            System.out.println("Size of array is more than 8 or less than 1");
            System.exit(2);
        }
        int mid = length / 2;
        if (mid - 1 < 0 || mid + 1 >= length) {
            System.out.println("Index out of bounds for length");
            System.exit(1);
        }
        int[] intNumbers = new int[length];
        System.out.print("Enter first integer number: ");
        int a = Scanner.nextInt();
        System.out.print("Enter second integer number: ");
        int b = Scanner.nextInt();
        intNumbers[mid - 1] = a < b ? a : b;
        intNumbers[mid + 1] = a < b ? b : a;
        System.out.println("Number at index " + (mid - 1) + " is: " + intNumbers[mid - 1]);
        System.out.println("Number at index " + (mid + 1) + " is: " + intNumbers[mid + 1]);

    }
}