package BasicCore;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a ");
        double a = scanner.nextDouble();

        System.out.println("Enter value of b");
        double b = scanner.nextDouble();

        System.out.println("Enter value of c");
        double c = scanner.nextDouble();

        double delta = b * b - 4.0 * a * c;

        double rootOfX1 = (-b + sqrt(delta)) / (2.0 * a);
        double rootOfX2 = (-b - sqrt(delta)) / (2.0 * a);
        System.out.println("Roots of X = "+rootOfX1+" & "+rootOfX2);
    }
}