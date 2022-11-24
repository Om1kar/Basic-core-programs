package BasicCore;

import java.util.Scanner;

public class HeadVsTail {
    /**
     *
     * @param ->to calculate no times coin flips and its percentage
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of times you want to flip a Coin ");
        int toss = scanner.nextInt();
        int Heads = 0;
        int Tails = 0;

        if (toss > 0) {
            for (int i = 0; i < toss; i++) {
                double flipCoin = Math.random();// using random method for random numbers
                if (flipCoin < 0.5) {
                    Heads++;
                    System.out.println("Heads");
                } else {
                    Tails++;
                    System.out.println("Tails");
                }
            }
            int heads = (Heads * 100) / toss;
            int tails = (Tails * 100) / toss;
            System.out.println("Percentage of Heads-" + heads + "%");
            System.out.println("Percentage Tails-" + tails + "%");

        }
    }
}


