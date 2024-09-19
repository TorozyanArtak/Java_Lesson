package Homework_19_09_24;
//Ստուգում ենք, թե արդյոք 2-րդ զանգվածը պարունակվում է առաջինի մեջ

import java.util.Scanner;

public class ArrayInclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first array size ");
        int longLength = scanner.nextInt();
        System.out.print("Enter second array size ");
        int shortLength = scanner.nextInt();
        if (shortLength < 1 || shortLength > longLength) {
            System.out.print("Second array size can not be less than 1 and more than first array size");
            System.exit(2);
        }
        int[] longArray = new int[longLength];
        int[] shortArray = new int[shortLength];
        for (int i = 0; i < longLength; i++) {
            System.out.print("Input number of longArray " + i + " ");
            longArray[i] = scanner.nextInt();
        }
        System.out.println("---------------");
        for (int j = 0; j < shortLength; j++) {
            System.out.print("Input number of shortArray " + j + " ");
            shortArray[j] = scanner.nextInt();
        }
        boolean isNotIncluded = true;
        int count = longLength - shortLength + 1;
        for (int i = 0; i < count; i++) {
            boolean isInclude = true;
            for (int j = 0; j < shortLength; j++) {
                if (longArray[j + i] != shortArray[j]) {
                    isInclude = false;
                    break;
                }
            }
            if (isInclude) {
                System.out.println("Second array contains the first array");
                isNotIncluded = false;
                break;
            }
        }
        if (isNotIncluded) {
            System.out.println("Second array doesn't contains the first array");
        }

    }
}
