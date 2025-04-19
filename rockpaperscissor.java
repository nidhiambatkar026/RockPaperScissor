import java.util.random.*;
import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {

    private static final String string = null;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String rps[] = {"ROCK", "PAPER", "SCISSORS"};
            String ComputerMove;
            String PlayerMove;
            ComputerMove = rps[new Random().nextInt(rps.length)];

            System.out.println("Enter your move(ROCK, PAPER, SCISSORS):");
            
        }
    }
}
