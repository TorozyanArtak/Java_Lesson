package homework_11_09_24;

public class ReverseNonNegativeArray {
    public static void main(String[] args) {
        double[] origin = {-1.2, -8.5, 4.1, -14.1, 3.5};
        double[] reverse = new double[5];
        int index = 0;
        if (origin[0] >= 0) {
            reverse[4 - index] = origin[0];
            index++;
        }
        if (origin[1] >= 0) {
            reverse[4 - index] = origin[1];
            index++;
        }
        if (origin[2] >= 0) {
            reverse[4 - index] = origin[2];
            index++;
        }
        if (origin[3] >= 0) {
            reverse[4 - index] = origin[3];
            index++;
        }
        if (origin[4] >= 0) {
            reverse[4 - index] = origin[4];
        }
        System.out.println("Elements of reverse array are " + reverse[0] + " " + reverse[1] + " " + reverse[2] + " " + reverse[3] + " " + reverse[4]);
    }
}