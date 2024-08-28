package testnetbeans;

import java.util.Random;

public class SoXo {
    public static void main(String[] args) {
        Random rand= new Random();
        int result = rand.nextInt(100) + 1;
        System.out.println("Ket qua la: " + result);
    }
}