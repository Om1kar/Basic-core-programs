package BasicCore;

import java.util.Scanner;

public class EvenOrOdd {
    static void checkEvenOrOdd(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is a Even Number");
        } else {
            System.out.println(number + " is a Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number To check Even or Odd");
        int number = scanner.nextInt();
        checkEvenOrOdd(number);
    }
}
