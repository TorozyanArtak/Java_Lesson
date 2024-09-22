package Homework_07_09_24;

import java.util.Scanner;

public class AccessAndCost {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Fill in your age: ");
        int age = Scanner.nextInt();
        if (age < 16) {
            System.out.println("Under 16s are not allowed");
            System.exit(2);
        }
        System.out.print("VIP client: ");
        boolean vip = Scanner.nextBoolean();
        Scanner Order = new Scanner(System.in);
        System.out.println("Fill in the value of your order: ");
        double order = Order.nextDouble();
        if (vip) {
            double vipCost = order * 0.85;
            System.out.println("The VIP client's order amounts is: " + vipCost);
        } else {
            double notVipCost = order + 5000;
            System.out.println("The non-VIP client's order amounts is: " + notVipCost);
        }
    }
}