package testnetbeans;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("What percentage did you earn?");
        int percent = scanner.nextInt();
        if (percent >= 90) {
            System.out.println("You got an A!");
        }
        if (percent >= 80) {
            System.out.println("You got an B!");
        }
        if (percent >= 70) {
            System.out.println("You got an C!");
        }
        if (percent >= 60) {
            System.out.println("You got an D!");
        }
        if (percent < 60) {
            System.out.println("You got an F!");
        }
    }
}