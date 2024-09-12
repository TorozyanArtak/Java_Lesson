import java.util.Scanner;

public class IndexUpdater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = scanner.nextInt();
        if (size < 1) {
            System.out.println("Array size can not be less than 1");
            System.exit(1);
        }
        System.out.print("Enter index: ");
        int index = scanner.nextInt();
        if (index < 0 || (index + 3) >= size) {
            System.out.println("The operation can not be done for index " + index);
            System.exit(2);
        } else {
            int[] numbers = new int[size];
            numbers[++index] = index;
            System.out.println("Number of " + index + " index of array is: " + numbers[index]);
            numbers[++index] = index;
            System.out.println("Number of " + index + " index of array is: " + numbers[index]);
            numbers[++index] = index;
            System.out.println("Number of " + index + " index of array is: " + numbers[index]);

        }


    }
}