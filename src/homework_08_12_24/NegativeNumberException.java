package homework_08_12_24;

public class NegativeNumberException extends Exception {

    public NegativeNumberException(int n){
        super("The number should not be negative: you entered " +n + ": " + "please try again");
    }


}
