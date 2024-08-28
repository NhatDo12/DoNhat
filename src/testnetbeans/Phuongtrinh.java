package testnetbeans;

import java.util.Scanner;

public class Phuongtrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap gia tri cua a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap gia tri cua b: ");
        int b = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }  
        } else {
            System.out.println("Nghiem cua phuong trinh la: " + -b/a );
        }  
    }
}
