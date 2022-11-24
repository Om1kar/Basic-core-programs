package BasicCore;

import java.util.Scanner;

public class VowelOrConsonant {
    static void checkVowelOrConsonant(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||
                ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
            System.out.println("Entered Word is Vowel");
        } else {
            System.out.println("Entered Word is Consonant");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Word to Check");
        char ch = scanner.next().charAt(0);
        checkVowelOrConsonant(ch);
    }
}
