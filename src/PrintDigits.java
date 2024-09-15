// Տպում ենք դրական ամբողջ թվի թվանշանները ձախից աջ հերթականությամբ
public class PrintDigits {
    public static void main(String[] args) {
        int number = 691257;
        int length = number;
        int dozen = 1;
        while (length >= 10) {
            length /= 10;
            dozen *= 10;
        }
        while (dozen > 0) {
            int digit = number / dozen;
            System.out.print(digit + " ");
            number %= dozen;
            dozen /= 10;
        }
    }
}
