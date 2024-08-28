package testnetbeans;

import java.util.Scanner;

public class BT1nhapthongtin {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your fullname: ");
        String fullName=keyboard.nextLine();
        System.out.println("Enter your old: ");
        int old = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter born year: ");
        int year = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter sex: ");
        String sex = keyboard.next();
        System.out.println("Enter major: ");
        String major = keyboard.nextLine();
        System.out.println("Enter your GPA : ");
        float gpa = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.println("Enter the hometown : ");
        String hometown = keyboard.nextLine();
        System.out.println(fullName + "-" + old + "-" + sex + "-" + major + "-" + gpa + "-" + hometown);
    }
}
