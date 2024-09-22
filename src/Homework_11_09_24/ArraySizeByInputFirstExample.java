import java.util.Scanner;

public class ArraySizeByInputFirstExample {
    public static void main(String[] args) {
        Scanner Integer = new Scanner(System.in);
        System.out.print("Length of array is: ");
        int arrayLength = Integer.nextInt();
        if (arrayLength < 1) {
            System.out.println("Size of array is less than 1");
            System.exit(2);
        }
        int[] array;
        switch (arrayLength) {
            case 3:
            case 4:
            case 5:
                array = new int[arrayLength];
                break;
            case 6:
            case 7:
                array = new int[10];
                break;
            default:
                array = new int[15];
                array[0] = 15;
        }
        System.out.println("Array size is " + array.length);
        System.out.println("First number of array is " + array[0]);
    }
}
