public class ReverseNonNegativeArray {
    public static void main(String[] args) {
        double[] origin = {14.58, 25.36, -12.8, 0, 8.5};
        double[] reverse = new double[5];
        int indexOrigin = origin.length - 1;
        int indexReverse = 0;
        reverse[indexReverse] = origin[indexOrigin] >= 0 ? origin[indexOrigin] : 0;
        System.out.println("Number at index " + indexReverse + " of reverse array is " + reverse[indexReverse]);
        indexOrigin--;
        indexReverse++;
        reverse[indexReverse] = origin[indexOrigin] >= 0 ? origin[indexOrigin] : 0;
        System.out.println("Number at index " + indexReverse + " of reverse array is " + reverse[indexReverse]);
        indexOrigin--;
        indexReverse++;
        reverse[indexReverse] = origin[indexOrigin] >= 0 ? origin[indexOrigin] : 0;
        System.out.println("Number at index " + indexReverse + " of reverse array is " + reverse[indexReverse]);
        indexOrigin--;
        indexReverse++;
        reverse[indexReverse] = origin[indexOrigin] >= 0 ? origin[indexOrigin] : 0;
        System.out.println("Number at index " + indexReverse + " of reverse array is " + reverse[indexReverse]);
        indexOrigin--;
        indexReverse++;
        reverse[indexReverse] = origin[indexOrigin] >= 0 ? origin[indexOrigin] : 0;
        System.out.println("Number at index " + indexReverse + " of reverse array is " + reverse[indexReverse]);
    }
}


