package Arrays;

import java.util.Scanner;

public class TinhTrungBinhCong {
    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        
        int[] mang = new int[n];
        
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mang[i];
        }
        double average = (double) sum / n;
        System.out.println("Trung binh cong cua cac phan tu trong mang la: " + average);
    }
}
