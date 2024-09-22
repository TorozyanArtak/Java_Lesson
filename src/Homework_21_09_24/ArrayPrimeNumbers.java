package Homework_21_09_24;
//Մեթոդի օգնությամբ տպում ենք զանգվածի պարրզ թվերը

public class ArrayPrimeNumbers {
    static boolean checkPrime(int number) {
        boolean isPrime = number >= 2;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 4, 1, 41, 31, 67};
        for (int i : arr) {
            if (checkPrime(i)) {
                System.out.println(i + " is prime number");
            } else {
                System.out.println(i + " is not prime number");
            }
        }
    }
}
