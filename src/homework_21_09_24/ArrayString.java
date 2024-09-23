package homework_21_09_24;
//Ստանում ենք String-ի բառերի քանակը

public class ArrayString {
    public static int getStringWordCount(String string) {
        int count = 0;
        char space = ' ';
        for (int i = 0; i < string.length(); i++) {
            while (i < string.length() && string.charAt(i) == space){
                i++;
            }
            if(string.charAt(i) != space){
                count++;
                while ( i < string.length() && string.charAt(i) != space){
                    i++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "  A method is a way to perform   hhhh     some task ";
        getStringWordCount(text);
        System.out.println(getStringWordCount(text));

    }
}
