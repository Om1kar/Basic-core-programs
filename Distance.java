package BasicCore;

import java.util.Scanner;

public class Distance {
    /**
     * Function to calculate the value of distance
     *
     * @param ->value of x1 and y1
     */
    public static void main(String[] args) {
        double x1;
        double y1;
        System.out.println("Enter the coordinates:x1,y1");
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        double distance = Math.sqrt(x1 * x1) + (y1 * y1);
        System.out.println("Euclidean distance between entered coordinates is =" + Math.pow(x1, y1) + distance);

    }
}
