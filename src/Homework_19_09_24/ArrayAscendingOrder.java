package Homework_19_09_24;

import java.util.Scanner;

public class ArrayAscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size ");
        int size = scanner.nextInt();
        if (size < 2) {
            System.out.print("Array size can not be less than 2");
            System.exit(2);
        }
        int[] arrayUp = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input number " + i + " ");
            arrayUp[i] = scanner.nextInt();
        }
        int ascendingOrderLength = 0;
        int longestAscendingOrderLength = 0;
        for (int i = 1; i < size; i++) {
            if (arrayUp[i] > arrayUp[i - 1]) {
                ascendingOrderLength++;
            } else {
                if (ascendingOrderLength >= longestAscendingOrderLength) {
                    longestAscendingOrderLength = ascendingOrderLength;
                }
                ascendingOrderLength = 0;
            }
        }
        if (ascendingOrderLength >= longestAscendingOrderLength) {
            longestAscendingOrderLength = ascendingOrderLength;
        }
        System.out.println("The longest ascending order length in the array is: " + longestAscendingOrderLength);
    }
}
