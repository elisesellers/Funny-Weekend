package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.GameControl;
import byui.CIT260.funnyWeekend.model.Game;
import funnyweekend.FunnyWeekend;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Yura
 */
public class MainMenuView extends View{
    
    
    private String promptMessage = "\nPlease enter the menu option: ";
    
    public MainMenuView(){
        
        super("\n"
                + "\n------------------------------------"
                + "\n   Main Menu"
                + "\n------------------------------------"
                + "\nN -- Start new game"
                + "\nG -- Get and start saved game"
                + "\nH -- Get help on how to play the game"
                + "\nS -- Save the game"
                + "\nQ -- Quit the game"
                + "\nWA -- Save and print out word answers"
                + "\nMA -- Save and print out math answers"
                + "\n------------------------------------");
        
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); 
        
        switch (choice) {
            case "N":  // create and start a new game
                this.startNewGame();
                break;
            case "G":  // get and start an existing game
                this.startSavedGame();
                break;
            case "H":  // display the help menu
                this.displayHelpMenu();
                break;
            case "S":  // save the current game
                this.saveGame();
                break;
            case "WA": // write the words answers to a file
                this.writeWordAnswers();
                break;
            case "MA":
                this.mathAnswers();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try agin");
                break;
        }
        return false;
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(FunnyWeekend.getPlayer());
        
        // display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startSavedGame() {
        
        // prompt for and get the name of the file to sabe the game in
        this.console.println("\n\nEnter the file path for file where the game is saved.");
        
        String filePath = this.getInput();
        
        try{
            // start a saved game
            GameControl.getSavedGame(filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu(){
        this.console.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game is to be saved.");
        String filePath = this.getInput();
        
        try{
            //save the game to the spesified file
            GameControl.saveGame(FunnyWeekend.getCurrentGame(), filePath);
        }catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }    

    private void writeWordAnswers() {
        // prompt for and get the name of the file to write the word answers
        this.console.println("\n\nEnter the file path for the file where the word answers will be written.");
        String filePath = this.getInput();
        
        try(PrintWriter out = new PrintWriter(filePath)){
            // print the header
            out.println("\n            -- Here are the word answers --             \n");
            /* for ever item in the list
                 print info about item;
            */
            String [][] wordAnswers = FunnyWeekend.getCurrentGame().getWords();
            for (int i = 0; i < 6; i++){
                out.println("Writing assignment #," + (i + 1) + ":  ");
                for (int i1 = 0; i1 < 10; i1++){
                    out.println(wordAnswers[i][i1] + ", ");
                }
                out.println("\n");
            }
            
        }catch(IOException ex){
            System.out.println("I/O error" + ex.getMessage());
        }
    }

   public int mathAnswers(int[] numbers) {
       
       this.console.println("\n\nEnter the file path for the file where the word answers will be written.");
        String filePath = this.getInput();
        
        try (PrintWriter out = new PrintWriter(filePath)){
            
            out.println("\n\n           Math Answers           ");
            out.printf("%n%-20s%10s", "Location", "Answer");
            out.printf("%n%-20s%10s", "--------", "-------");
            
            for(int i = 0; i < numbers.length; i++){
                out.printf("%n%-20d%7d", i + ": ", numbers[i]);
                        
                out.println("\n");
            }
            
        }catch(IOException ex){
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
}
