package testnetbeans;

import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random();
        int r = rand.nextInt(3);
        if (r == 0) {
            System.out.println("Rock");
        } else if (r == 1) {
            System.out.println("Paper");
        } else { // r == 2
            System.out.println("Scissors");
        }
    }
}
