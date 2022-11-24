package BasicCore;

import java.util.Scanner;

public class LeapYear {
    static void checkLeapYearOrNot(int year) {
        if (year % 4 == 0 && year % 100 != 0 ) {
            System.out.println(year + " is Leap Year");
        } else if (year % 400 == 0) {
            System.out.println(year + " is Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Year");
        int year = scanner.nextInt();
        checkLeapYearOrNot(year);
    }
}
