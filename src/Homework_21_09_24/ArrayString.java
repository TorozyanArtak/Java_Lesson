package Homework_21_09_24;
//Ստանում ենք String-ի բառերի քանակը

public class ArrayString {
    public static int getStringWordCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            while (i < string.length() && string.charAt(i) == 32){
                i++;
            }
            if(string.charAt(i) != 32){
                count++;
                while ( i < string.length() && string.charAt(i) != 32){
                    i++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "  A method is a way to perform    some task ";
        getStringWordCount(text);
        System.out.println(getStringWordCount(text));

    }
}
