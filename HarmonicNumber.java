package BasicCore;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n");
        number = scanner.nextInt();

        double harmonicNumber = 0.0;

        while (number > 0) {
            harmonicNumber = harmonicNumber + ((double) 1 / number);
            number--;
            System.out.println("Harmonic number = " + harmonicNumber);
        }
    }
}


