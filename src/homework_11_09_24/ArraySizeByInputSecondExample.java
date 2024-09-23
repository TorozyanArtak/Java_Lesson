package homework_11_09_24;

import java.util.Scanner;

public class ArraySizeByInputSecondExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of array is: ");
        int length = scanner.nextInt();
        if (length < 1) {
            System.out.println("Size of array is less than 1");
            System.exit(2);
        }
        int[] array;
        array = new int[(length == 3 || length == 4 || length == 5) ? length : (length == 6 || length == 7) ? 10 : 15];
        array[0] = length < 3 || length > 7 ? 15 : 0;
        System.out.println("Array size is " + array.length);
        System.out.println("First number of array is " + array[0]);
    }
}
