package BasicCore;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows= ");
        int rows = sc.nextInt();
        System.out.println("Enter column= ");
        int columns = sc.nextInt();
        int[][] array2 = new int[rows][columns];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = i + j;
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
