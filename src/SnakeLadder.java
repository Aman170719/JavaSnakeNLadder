import java.sql.SQLOutput;
import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        int readyPlayer1 = 0;
        int Player1Position = 0;
        int Player2Position = 0;
        int   count =0;
        int   count1 =0;
        System.out.println("Welcome to the Snake AND Ladder Game");
        System.out.println("The Game Start from " + readyPlayer1);
        Random random = new Random();
        while ((Player1Position <= 99)&& (Player2Position<=99)) {
            System.out.println("The Player Start from " + Player1Position);
            int Dice = random.nextInt(7);
            Player1Position = Player1Position + Dice;
            System.out.println("The Dice Rolled and Landed on " + Dice);
            int opt = random.nextInt(4);
            int opt1 = random.nextInt(4);
            System.out.println(opt);
            System.out.println(opt1);
            count = (count +1);
            count1 = (count1 +1);
            switch (opt) {
                case 1:
                    Player1Position = Dice;
                    System.out.println("Player is in the same Position " + readyPlayer1);
                    break;
                case 2:
                    Player1Position = (Player1Position + Dice);
                    if (Player1Position > 100) {
                        Player1Position = (Player1Position - Dice);
                    }
                    System.out.println("You Got ladder and your at " + Player1Position);
                    continue;
                case 3:
                    Player1Position = (Player1Position - Dice);

                    if (Player1Position < 0) {
                        Player1Position = 0;
                    }
                    System.out.println("You Got SnakeBite your position is " + Player1Position);
                    break;
            }
            switch(opt1) {
                case 1:
                    System.out.println( "No Play You are in the same Position " +Player2Position );
                    break;

                case 2:
                    Player2Position = (Player2Position + Dice);
                    if(Player2Position>100){
                        Player2Position = (Player2Position - Dice);
                        continue;
                    }
                    System.out.println( "your Position after ladder is :" + Player2Position );
                    break;

                case 3:
                    Player2Position = (Player2Position - Dice);

                    if(Player2Position<0){
                        Player2Position = 0;
                    }

                    System.out.println( "Your Position after snake is " + Player2Position );
                    break;
            }}
		            if(Player1Position == 100) {
                        System.out.println("Player 1 is the Winner!");
                        System.out.println("Dice play number " + count);
                    }
			        else{
                        System.out.println( "Player 2 is the Winner!" );
                        System.out.println( "Dice play number " + count1 );
    }
	                	System.out.println( "Dice Total play number is " + (count1+count));
}
	     }

