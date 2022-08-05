import java.sql.SQLOutput;
import java.util.Random;

public class SnakeLadder {
        public static void main(String[] args) {
            System.out.println("Welcome to the Snake AND Ladder Game");
            int readyPlayer1 = 0;
            int Player1Position =0;
            Random random = new Random();
            int Dice = random.nextInt(7);
            Player1Position = Player1Position + Dice;
            System.out.println("The Player Start from " + readyPlayer1);
            System.out.println("The Game Start from " + readyPlayer1);
            System.out.println("The Dice Rolled and Landed on " + Dice);
            int opt = random.nextInt(4);
            System.out.println(opt);
            switch (opt){
                case 1:
                    Player1Position = Dice;
                    System.out.println("Player is in the same Position " + readyPlayer1);
                    break;
                case 2:
                    Player1Position =(Player1Position + Dice);
                    System.out.println("You Got ladder and your at " + Player1Position);
                    break;
                case 3:
                    Player1Position = (Player1Position - Dice);

                    if (Player1Position < 0) {
                        Player1Position = 0;
                    }
                        System.out.printf("You Got SnakeBite your position is " + Player1Position );
                        break;
                    }
            }
        }

