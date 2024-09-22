package Homework_07_09_24;

import java.util.Scanner;

public class CheckTriangleSidesValidity {
    public static void main(String[] args) {
        Scanner Integer = new Scanner(System.in);
        System.out.print("Input the length of the first side of the triangle: ");
        int side1 = Integer.nextInt();
        if (side1 < 1) {
            System.out.println(side1 + " isn't valid side");
            System.exit(2);
        }
        System.out.print("Input the length of the second side of the triangle: ");
        int side2 = Integer.nextInt();
        if (side2 < 1) {
            System.out.println(side2 + " isn't valid side");
            System.exit(2);
        }
        System.out.print("Input the length of the third side of the triangle: ");
        int side3 = Integer.nextInt();
        if (side3 < 1) {
            System.out.println(side3 + " isn't valid side");
            System.exit(2);
        }
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            System.out.println("The following numbers could be valid triangle sides: " + side1 + ", " + side2 + ", " +side3) ;
        }else {
            System.out.println("Impossible to create rectangle with the following sides: " + side1 + ", " + side2 + ", " +side3);
            System.exit(2);
        }
    }
}