import java.sql.SQLOutput;
import java.util.Random;

public class SnakeLadder {
        public static void main(String[] args) {
            System.out.println("Welcome to the Snake AND Ladder Game");
            int readyPlayer1 = 0;
            System.out.printf("The Game Start from " + readyPlayer1);
        }
        void Dice(){
            Random random = new Random();
            int Dice = random.nextInt(6);
            System.out.printf("The Dice Rolled and Landed on" + Dice);
        }
}