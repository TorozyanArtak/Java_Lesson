package Homework_19_09_24;
// Ստանում ենք զանգվածի minimum և maximum թվերը

public class ArrayMaxMinNumbers {
    public static void main(String[] args) {
        int[] origin = {-5,2,-15,6,25,32,-2,14};
        int max = origin[0];
        int min = origin[0];
        for (int j = 1; j < origin.length; j++) {
            if (origin[j] > max) {
                max = origin[j];
                continue;
            }
            if (origin[j] < min) {
                min = origin[j];
            }
        }
        System.out.println("Minimum number of array is " + min);
        System.out.println("Maximum number of array is " + max);
    }
}
