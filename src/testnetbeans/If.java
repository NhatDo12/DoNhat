package testnetbeans;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap gia tri x vao: ");
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println("Positive");
        } else if (x < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
