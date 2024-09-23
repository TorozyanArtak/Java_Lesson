package homework_19_09_24;
//Զանգվածի առաջին բացասական թվից հետո պետքա insert անեք նոր թիվ՝ տվյալ բացասական էլեմենտի ինդեքսը և ստանանք նոր զանգված

import java.util.Scanner;

public class ArrayInsertNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size ");
        int originLength = scanner.nextInt();
        if (originLength < 1) {
            System.out.print("Array size can not be less than 1");
            System.exit(2);
        }
        int[] origin = new int[originLength];
        for (int i = 0; i < originLength; i++) {
            System.out.print("Input number " + i + " ");
            origin[i] = scanner.nextInt();
        }
        int negativeNumber = 0;
        for (int i = 0; i < originLength; i++) {
            if (origin[i] < 0) {
                negativeNumber++;
            }
        }
        int[] result = new int[originLength + negativeNumber];
        for (int i = 0, j = 0; i < result.length; i++, j++) {
            result[i] = origin[j];
            if (origin[j] < 0) {
                result[i + 1] = j;
                i++;
            }
        }
        for (int i:result) {
            System.out.print(result[i] + " ");
        }
    }
}
