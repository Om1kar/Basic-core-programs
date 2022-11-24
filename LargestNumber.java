package BasicCore;

import java.util.Scanner;

public class LargestNumber {
    static void checkLargestNumber(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " Is Greater among Three");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " Is Greater among Three");

        } else if (number1 == number2 && number2 == number3) {
            System.out.println("Equal Numbers");

        } else {
            System.out.println(number3 + " Is Greater among Three");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter third number");
        int number3 = scanner.nextInt();
        checkLargestNumber(number1, number2, number3);
    }
}
