package testnetbeans;

import java.util.Scanner;

public class Place {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap gia tri place vao: ");
        int place = scanner.nextInt();
        if (place == 1) {
            System.out.println("Gold medal!");
        } else if (place == 2) {
            System.out.println("Silver medal!");
        } else if (place == 3) {
            System.out.println("Bronze medal!");
        }
        
    }
}
