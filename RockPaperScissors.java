// Name: fouzaan ahmed shaik nissar
// Date: 20 feb 2023
// APP Name: Rock Paper Scissors
//Description: Rock Paper Scissors game made in terminal

public class RockPaperScissors
{
    // Constants
    static final String SET_TITLE = "\033]0;%s\007";
    static final String CLEAR_TERMINAL = "\033c";
    static final String BANNER = """
            ***********************
            * Rock Paper Scissors *
            ***********************
            """;

    public static void main(String[] args) 
    {
      
        // Setting the title for console window
        System.out.printf(SET_TITLE, "Rock Paper Scissors - Fouzaan ahmed");

        // Variables
        String player;
        String cpu;
        String result;

        //Game loop - Repeat if player request
        do
        {
            // Clear the terminal and print banner
            System.out.println(CLEAR_TERMINAL + BANNER);
        

            // Player chooses an option
            player = Game.getPlayersChoice();

            // CPU chooses an option
            cpu = Game.getCpuChoice();

            // Get the result
            result = Game.getResult(player, cpu);

            // Print the result
            System.out.printf("%s%s VS %s%s = %s\n\n",
            Game.choiceToEmoji(player),player, Game.choiceToEmoji(cpu),cpu, result);
            // Ask the player if they want to play again
        }
          while(Game.playAgain());
        
        // Game over!
        Game.endGame();
        
        
    }

}