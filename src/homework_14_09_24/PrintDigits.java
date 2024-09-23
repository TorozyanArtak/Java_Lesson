package homework_14_09_24;// Տպում ենք դրական ամբողջ թվի թվանշանները ձախից աջ հերթականությամբ
import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        System.out.println("Input positive number");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your number is ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Number can not be non positive");
            System.exit(2);
        }
        int length = 0;
        int sameNum = number;
        while (sameNum > 0) {
            sameNum /= 10;
            length++;
        }
        int[] arrayDigits = new int[length];
        for (int i = 0 ; i < length; i++) {
            arrayDigits[length-1-i] = number % 10;
            number /= 10;
        }
        for (int j = 0; j< length; j ++) {
            System.out.print( arrayDigits[j] + " ");
        }
    }
}
