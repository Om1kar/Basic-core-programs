package BasicCore;

import java.util.Scanner;

public class WindChill {
    /**
     *@param ->Write a program WindChill.java that takes two double command-line arguments t
     * and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the temperature
     * t (in Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) to be:
     */
    public static void main(String[] args) {
        double temperature;
        double velocity;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature = ");
        temperature = scanner.nextDouble();
        System.out.println("Enter the velocity = ");
        velocity = scanner.nextDouble();
        double w = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16);
        System.out.println("WindChill = " + w + " mph");
    }
}
