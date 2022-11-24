package BasicCore;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        int number1 = scanner.nextInt();
        System.out.println("Enter second value");
        int number2 = scanner.nextInt();
        int quotient;
        int remainder;
        quotient = number1 / number2;
        remainder = number1 % number2;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

    }
}