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
                this.startExistingGame();
                break;
            case "H":  // display the help menu
                this.displayHelpMenu();
                break;
            case "S":  // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try agin");
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

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu(){
        System.out.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame stub function called ***");
    }    
}
