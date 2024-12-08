package homework_08_12_24;

public class Recursion {

    public static String getBinary(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException(n);
        }
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return getBinary(n / 2) + (n % 2);

//  ենթ․ n=10
//  getBinary(10) = getBinary(5) + 0 = getBinary(2) + 1 + 0 = getBinary(1) + 0 + 1 + 0 = 1 + 0 + 1 + 0

    }
}
