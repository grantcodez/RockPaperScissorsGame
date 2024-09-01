package RPS2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //declare variables
        int playerWins = 0;
        int playerLoses = 0;
        int playerTies = 0;
        String playerChoice ="";
        int playerTurns = 0;

         //initialize scanner
         Scanner scanner = new Scanner(System.in);

         //create rand obj
         Randnumgen randnumgen = new Randnumgen();
        
        
        //do while loop to run until player runs out of turns
        do{
            //try code and check for invalid input
            try {
                //ask for player ch1oice  and number of rounds you would like to play
                System.out.println("Please enter either rock, paper, or scissors and \nthe amount of rounds you want to play with a space in between choice and rounds.");
                System.out.print("player choice and number of rounds: ");
                playerChoice = scanner.next();
                playerTurns= scanner.nextInt();
                
            } catch (InputMismatchException e) {
                 //deals with the mismatchexception
                 System.out.println("Error invalid input! Please try to input valid string and number: ");
                 //removes invalid input
                 scanner.nextLine();
                 //continues through the loop
                 continue;
            }
           
           
            //generate computer random choice
            String computerChoice = randnumgen.randNumGen();

            //if else statement to determine who wins, loses, or ties
            
            if (playerChoice.equals("rock") && computerChoice.equals("scissors")
            || playerChoice.equals("paper") && computerChoice.equals("rock")
            || playerChoice.equals("scissors") && computerChoice.equals("paper")){
                playerWins++;
            }
                
            else if (playerChoice.equals("scissors") && computerChoice.equals("rock")
            || playerChoice.equals("rock") && computerChoice.equals("paper")
            || playerChoice.equals("paper") && computerChoice.equals("scissors")){
                playerLoses++;
            }
        
            else if(playerChoice == computerChoice){
                playerTies++;
            }

            //print out the computer/player choice and players wins loses and ties
            System.out.println("The player choice: " + playerChoice + " \nThe computer choice: " + computerChoice + ".");
            System.out.printf("The player won: " + playerWins + "\n lost: " + playerLoses + "\n tied: " + playerTies +" times. \n");
              
            //reduce player turn count every loop
            playerTurns--;
        }while(playerTurns > 0);
        //close scanner
        scanner.close();
    }
}
