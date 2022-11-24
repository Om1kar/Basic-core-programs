package BasicCore;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int number ;
        int power = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Power value");
        number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            power = power * 2;

            System.out.println("value = " + power);
        }
        System.out.println("Final Value = " + power);
    }


}
