package testnetbeans;

import java.util.Random;
import java.util.Scanner;

public class AddingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Random rand = new Random();
        System.out.println("Ban co 3 luot choi");
        
        int points = 0;
        int wrong = 0;
        while (wrong < 3) {
            int result = play(console, rand);
            if (result > 0) {
                points++;
            } else {
                wrong++;
            }
        }
        System.out.println("Ban nhan duoc " + points + " diem.");
    }
    public static int play(Scanner console, Random rand) {
        int operands = rand.nextInt(4) + 2;
        int sum = rand.nextInt(10) + 1;
        System.out.print(sum);
        
        for (int i = 2; i <= operands; i++) {
            int n = rand.nextInt(10) + 1;
            sum += n;
            System.out.print(" + " + n);
        }
        System.out.print(" = ");
        
        int guess = console.nextInt();
        if (guess == sum) {
            System.out.println("Dung!");
            return 1;
        } else { 
            System.out.println("Sai!");
            return 0;
                    
        }
    }
}
