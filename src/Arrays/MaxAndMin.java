package Arrays;

import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();

        int[] mang = new int[n];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
        int max = mang[0];
        int min = mang[0];

        for (int i = 1; i < n; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        System.out.println("Gia tri lon nhat trong mang la: " + max);
        System.out.println("Gia tri nho nhat trong mang la: " + min);
    }
}
