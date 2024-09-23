package homework_21_09_24;
// Մեթոդով ստուգում ենք՝ զանգվածը պարունակում է նշված թիվը

public class ArrayContainNumber {
    public static boolean includeNumber(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 87, 0, 6, 78, 14, 0, 2, -5, -25, 1, 87, 2, 5};
        int number = -100;
        System.out.println(includeNumber(array, number));
    }
}
