package homework_19_09_24;
// Գտնում ենք զանգվածում ամենաերկար աճող հաջորդականության երկարությունը

public class ArrayAscendingOrder {
    public static void main(String[] args) {
        int[] arrayUp = {5,4,3,2,4};
        int ascendingOrderLength = 0;
        int longestAscendingOrderLength = 0;
        for (int i = 1; i < arrayUp.length; i++) {
            if (arrayUp[i] > arrayUp[i - 1]) {
                ascendingOrderLength++;
            } else {
                if (ascendingOrderLength > longestAscendingOrderLength) {
                    longestAscendingOrderLength = ascendingOrderLength;
                }
                ascendingOrderLength = 0;
            }
        }
        if (ascendingOrderLength > longestAscendingOrderLength) {
            longestAscendingOrderLength = ascendingOrderLength;
        }
        System.out.println("The longest ascending order length in the array is: " + longestAscendingOrderLength);
    }
}
