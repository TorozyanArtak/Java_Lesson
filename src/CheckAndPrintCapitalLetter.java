import java.util.Scanner;

public class CheckAndPrintCapitalLetter {
    public static void main(String[] args) {
        Scanner Font = new Scanner(System.in);
        System.out.print("Input your small letter: ");
        char smallLetter = Font.next().charAt(0);
        if (smallLetter > 96 && smallLetter < 123) {
            char capitalLetter = (char) (smallLetter - 32);
            System.out.println("Capital letter of your inputted small letter is " + capitalLetter);
        } else {
            System.out.println(smallLetter + " is not English alphabet small letter");
            System.exit(2);
        }

    }
}