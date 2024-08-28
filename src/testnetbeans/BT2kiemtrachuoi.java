package testnetbeans;

import java.util.Scanner;

public class BT2kiemtrachuoi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input :");
        String input = keyboard.nextLine();
        boolean check = keyboard.hasNext();
        System.out.println("Kiem tra phai chuoi hay khong : " + check);
    }
}
