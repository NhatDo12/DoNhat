package testnetbeans;

import java.util.Scanner;

public class BT3kiemtrakytunguyen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input :");
        boolean check = keyboard.hasNextInt();
        System.out.println("Kiem tra phai ky tu hay khong : "+check);
    }
}
