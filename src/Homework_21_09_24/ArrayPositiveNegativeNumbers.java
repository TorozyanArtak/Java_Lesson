package Homework_21_09_24;
//Ստանում ենք զանգվածի դրական ու բացասական թվերի հարաբերակցությունը

public class ArrayPositiveNegativeNumbers {
    public static double getDivisionPosNegNumbers(int[] array) {
        int countNegative = 0;
        int countPositive = 0;
        for (int i= 0; i< array.length; i++) {
            if( array[i] == 0){
                continue;
            }
            if (array[i] > 0) {
                countPositive ++;
            } else {
                countNegative ++;
            }
        }
        if (countNegative == 0) {
            return -1;
        }
        return (double) countPositive / countNegative;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 8, 0, -10, -21, 80, -2, 100};
        int[] array2 = {5, 8, 15, 25, 35, 45, 5};
        System.out.println(getDivisionPosNegNumbers(array1));
        System.out.println(getDivisionPosNegNumbers(array2));
    }
}
