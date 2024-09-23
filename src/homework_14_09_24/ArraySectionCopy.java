package homework_14_09_24;// int տիպի զանգվածի a ինդեքսից b ինդեքս արժեքները վերագրում ենք նոր զանգվածի

import java.util.Scanner;

public class ArraySectionCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input array size: ");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println("Array size can not be less than 2");
            System.exit(1);
        }
        int[] origin = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input element " + i + " ");
            origin[i] = scanner.nextInt();
        }
        System.out.print("Enter first index number ");
        int a = scanner.nextInt();
        System.out.print("Enter second index number ");
        int b = scanner.nextInt();
        if (a < 0 || a > b || b >= n) {
            System.out.println("Incompatible values");
            System.exit(2);
        }
        int[] result = new int[b - a + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = origin[a + i];
            System.out.println("Number at index " + i + " of result array is: " + result[i]);
        }

    }
}
