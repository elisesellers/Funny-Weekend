package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.GameControl;
import funnyweekend.FunnyWeekend;
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
}
