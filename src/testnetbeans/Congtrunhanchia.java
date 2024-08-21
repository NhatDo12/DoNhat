/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testnetbeans;

import java.util.Scanner;

public class Congtrunhanchia {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Nhap so nguyen thu 1: ");
        int a = keyboard.nextInt();
        System.out.println("Nhap so nguyen thu 2: ");
        int b = keyboard.nextInt();
        
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        System.out.println("Tong cua a va b la: " + tong);
        System.out.println("Hieu cua a va b la: " + hieu);
        System.out.println("Tich cua a va b la: " + tich);
        if(b==0) {
            System.out.println("Loi: Khong the chia cho 0. ");
        }else{
            int thuong = a / b;
            int soDu = a % b;
            System.out.println("Thuong cua a va b la: " + thuong);
            System.out.println("So du cua a chia cho b la: " + soDu);
        }
    }
    
}
