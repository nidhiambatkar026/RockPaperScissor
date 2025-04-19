import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {

    private static final String string = null;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computerScore = 0;
        int playerScore = 0;

        while(true){
            String rps[] = {"ROCK", "PAPER", "SCISSORS"};
            String ComputerMove;
            String PlayerMove;
            ComputerMove = rps[new Random().nextInt(rps.length)];

            System.out.println("Enter your move(ROCK, PAPER, SCISSORS):");
            PlayerMove = scanner.nextLine();
            System.out.println("Computer move was: " + ComputerMove);

            if((PlayerMove.matches("ROCK") && ComputerMove.matches("ROCK")) || 
            (PlayerMove.matches("PAPER") && ComputerMove.matches("PAPER")) || (PlayerMove.matches("SCISSORS") && ComputerMove.matches("SCISSORS"))){
                System.out.println("The game was TIE>>>>");
            }
            else if((PlayerMove.matches("PAPER") && ComputerMove.matches("ROCK")) || (PlayerMove.matches("ROCK") && ComputerMove.matches("SCISSORS")) || (PlayerMove.matches("SCISSORS") && ComputerMove.matches("PAPER"))){
                System.out.println("Congratulations! You win this round!");
                playerScore++;
            }
            else if ((PlayerMove.matches("PAPER") && ComputerMove.matches("SCISSORS")) || (PlayerMove.matches("ROCK") && ComputerMove.matches("PAPER")) || (PlayerMove.matches("SCISSORS") && ComputerMove.matches("ROCK"))){
                System.out.println("Sorry! You lose this round!");
                computerScore++;
            }
            else{
                System.out.println("PlayerMove is not valid. Please enter a valid move.");
            }
              System.out.println("COMPUTER SCORE: " + computerScore);
              System.out.println("PLAYER SCORE: " + playerScore);

              if ((computerScore == 3 ) || (playerScore == 3)){
                System.out.println("\n \n");
                System.out.println("  Good Game!");
                System.out.println("Thanks for playing!");
                break;
            }
            }
            
        }
    }

