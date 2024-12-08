package homework_08_12_24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entered your number ");

        while (true) {
            try {
                int number = sc.nextInt();
                System.out.println(Recursion.getBinary(number));
                return;
            } catch (NegativeNumberException exception) {
                System.out.println(exception.getMessage());

            }
        }
    }
}
