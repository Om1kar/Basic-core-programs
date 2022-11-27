package BasicCore;

import java.util.Scanner;

public class SwapNumbers {
    static void toSwapTwoNumbers(int num1, int num2) {
        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;
        System.out.println("After Swapping");
        System.out.println(num1 + " is first number");
        System.out.println(num2 + " is second number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        toSwapTwoNumbers(num1, num2);
    }
}
