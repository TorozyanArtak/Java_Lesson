package homework_19_09_24;
//Ստուգում ենք, թե արդյոք 2-րդ զանգվածը պարունակվում է առաջինի մեջ

public class ArrayInclude {
    public static void main(String[] args) {

        int[] longArray = {1, 2, 3, 4, 5};
        int[] shortArray = {4, 5};
        boolean isIncluded = false;
        int count = longArray.length - shortArray.length;
        int i = 0;
        while (i <= count) {
            if (shortArray[0] == longArray[i]) {
                isIncluded = true;
                break;
            }
            i++;
        }
        for (int j = 1; j < shortArray.length; j++) {
            if (longArray[i + j] != shortArray[j]) {
                isIncluded = false;
                break;
            }
        }
        if (isIncluded) {
            System.out.println("Second array contains the first array");
        } else {
            System.out.println("Second array doesn't contains the first array");
        }

    }
}



