import java.util.Scanner;

public class AccessAndCost {
    public static void main(String[] args) {
        Scanner Age = new Scanner(System.in);
        System.out.print("Fill in your age: ");
        int age = Age.nextInt();
        if (age < 16) {
            System.exit(2);
        }
        Scanner VIP = new Scanner(System.in);
        System.out.print("VIP client: ");
        boolean vip = VIP.nextBoolean();
        Scanner Order = new Scanner(System.in);
        System.out.println("Fill in the value of your order: ");
        int order = Order.nextInt();
        if (vip) {
            double costVip = order * 0.85;
            System.out.println("The VIP client's charge amounts to: " + costVip);
        } else {
            double costNonVip = order + 5000;
            System.out.println("The non-VIP client's charge amounts to: " + costNonVip);
        }
    }
}