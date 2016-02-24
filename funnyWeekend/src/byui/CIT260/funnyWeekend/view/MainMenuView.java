package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.GameControl;
import funnyweekend.FunnyWeekend;
import java.util.Scanner;

/**
 *
 * @author Yura
 */
public class MainMenuView {
    
    private String menu;
    private String helpMenu;
    private String promptMessage = "\nPlease enter the menu option: ";
    
    public MainMenuView(){
        
        this.menu = "\n"
                + "\n------------------------------------"
                + "\n   Main Menu"
                + "\n------------------------------------"
                + "\nN -- Start new game"
                + "\nG -- Get and start saved game"
                + "\nH -- Get help on how to play the game"
                + "\nS -- Save the game"
                + "\nQ -- Quit the game"
                + "\n------------------------------------";
        
        this.helpMenu = "\n"
                + "\n------------------------------------"
                + "\n   Help Menu"
                + "\n------------------------------------"
                + "\nD -- Discribe the word"
                + "\nF -- Show the first letter of the word"
                + "\nW -- Call the wizard to show the formular for calculation"
                + "\nQ -- Quit the game"
                + "\n------------------------------------";
    }
    
    // displays the start progrm view
    void displayMainMenuView() {
        
        boolean done = false; // set flag to not done
        
        System.out.println(menu);
        do{
            // prompt for and get the player's name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // quit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while(!done);
    } 

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);//get inflile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; // initalize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length()<1){
                System.out.println("\nInvalid value: vaue cannot be blank");
                continue;
            }
            break; //end the loop
        }
        
        return value; //return the value entered
    }

    private boolean doAction(String choice) {
        
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
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        //System.out.println("*** startExistingGame function called ***");
        View13 fridayMath = new View13();
        fridayMath.displayView13();
    }

    private void displayHelpMenu() {
        
        boolean done = false; // set flag to not done
        
        System.out.println(helpMenu);
        do{
            // prompt for and get the player's name
            String helpMenuOption = this.getHelpMenuOption();
            if (helpMenuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // quit the game
            
            // do the requested action and display the next view
            done = this.doHelp(helpMenuOption);
            
        } while(!done);
    }

    private void saveGame() {
        System.out.println("*** saveGame stub function called ***");
    }

    private String getHelpMenuOption() {
        
        String returnValue = "";
        
        System.out.println("*** getHelpMenu stub function called ***");
        
        return returnValue;
    }

    private boolean doHelp(String helpMenuOption) {
        System.out.println("*** doHelp stub function called ***");
        
        return true;
    }
    
}
