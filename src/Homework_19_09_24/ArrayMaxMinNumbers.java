package Homework_19_09_24;
// Ստանում ենք զանգվածի minimum և maximum թվերը

import java.util.Scanner;

public class ArrayMaxMinNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size ");
        int length = scanner.nextInt();
        if (length < 1) {
            System.out.print("Array size can not be less than 1");
            System.exit(2);
        }
        int[] origin = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Input number " + i + " ");
            origin[i] = scanner.nextInt();
        }
        int max = origin[0];
        int min = origin[0];
        for (int j = 1; j < length; j++) {
            if (origin[j] > max) {
                max = origin[j];
            }
            if (origin[j] < min) {
                min = origin[j];
            }
        }
        System.out.println("Minimum number of array is " + min);
        System.out.println("Maximum number of array is " + max);
    }
}
