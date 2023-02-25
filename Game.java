// Name: fouzaan ahmed shaik nissar
// Date: 20 feb 2023
// APP Name: Rock Paper Scissors
//Description: Rock Paper Scissors game made in terminal


import java.util.Scanner;
import java.util.Random;


public class Game
{
    // User Input
    // Private means only usable with the class Game
    static private Scanner scanner = new Scanner(System.in);

    // Random number generator
    static private Random random = new Random();

    /*End the game by choosing the scanner */
    static void endGame()
    {
    scanner.close();
    }

    /**
    * Ask if the player wants to play again
    * @return true in case the user selects yes, otherwise, return
    */
    static boolean playAgain()
    {
        System.out.print("Play again? Choose (y/n): ");
        // return true in case the user enters y
        // stingVariable == "y" -> We dont do this here
        return scanner.nextLine().equals("y");
    }


/**
 * Ask the player to choose either rock, paper or scissors
 * Make sure that the player picks these options.
 * @return The player's choice
 */
static public String getPlayersChoice()
{
    // Variables
    String player;
    boolean validOption;

    do
    {
        System.out.print("Choose rock, paper, or scissors:");

        //Converted to lowercase:Rock, RoCK, ROCK -> rock
        player = scanner.nextLine().toLowerCase();

        // Check if the player picked a valid option
        // true if valid, false if not
        validOption = player.equals("rock") ||
                      player.equals("paper") ||
                      player.equals("scissors");

        // Error in case option is not valid
        if(!validOption) System.out.println("Error - Invalid Option!");
        // Repeat when option invalid
    } while(!validOption);

    // Valid option
    return player;
    
}

/**
 * Our Super AI will choose either rock, paper, or scissors!
 * @return The AI choice
 */
    static public String getCpuChoice()
    {
        // randomNumber -> Choice
        //            0 -> "rock"
        //            1 -> "paper"  
        //            2 -> "scissors" 

        // get a random number from 0 to 3
        int randomNumber = random.nextInt(0,3);

        switch(randomNumber)
        {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";
        }

    }

    /** 
     * Decide who wins/loses
     * @param player The player's choice
     * @param cpu Thr AI's choice
     * @return The winner!
    */
    static String getResult(String player, String cpu)
    {
        String result = "";
        // Draw condition
        if(player.equals(cpu)) result = "draw";
        //Player winning condition
        else if(
            player.equals("scissors") && cpu.equals("paper") ||
            player.equals("scissors") && cpu.equals("rock") ||
            player.equals("scissors") && cpu.equals("scissors") 
        ) result = "👌player wins!";

        //CPU winning condition
        else result = " 🤖AI wins!";

        // Return the winner
        return result;
    }

    // NOT NECESSARY
    static String choiceToEmoji(String choice)
    {
        if(choice.equals("rock")) return "✊";
        if(choice.equals("paper")) return "🤚";
        if(choice.equals("scissors")) return "✌️";
        return "";
    }   

}
