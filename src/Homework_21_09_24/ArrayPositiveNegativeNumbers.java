package Homework_21_09_24;
//Ստանում ենք զանգվածի դրական ու բացասական թվերի հարաբերակցությունը

public class ArrayPositiveNegativeNumbers {
    public static double getDivisionPosNegNumbers(int[] array) {
        int sumNegative = 0;
        int sumPositive = 0;
        for (int i : array) {
            if (i > 0) {
                sumPositive += i;
            } else {
                sumNegative += i;
            }
        }
        if (sumNegative == 0) {
            return -1;
        }
        return (double) sumPositive / sumNegative;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 8, 14, -10, -21, 80, -2, 100};
        int[] array2 = {5, 8, 15, 25, 35, 45, 5};
        System.out.println(getDivisionPosNegNumbers(array1));
        System.out.println(getDivisionPosNegNumbers(array2));
    }
}
