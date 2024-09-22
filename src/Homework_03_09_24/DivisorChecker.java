import java.util.Scanner;
public class DivisorChecker {
    public static void main(String[] args) {
        Scanner Integer = new Scanner(System.in);
        System.out.print( "Input your first Integer number: ");
        int num1 = Integer.nextInt();
        System.out.print( "Input your second Integer number: ");
        int num2 = Integer.nextInt();
        boolean isDivisible = num1 % num2 == 0;
        System.out.println("Result is " + isDivisible );


    }

}
