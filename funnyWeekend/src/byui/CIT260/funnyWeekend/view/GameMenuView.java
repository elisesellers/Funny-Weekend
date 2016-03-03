package byui.CIT260.funnyWeekend.view;

/**
 *
 * @author Yura
 */
public class GameMenuView extends View{
    
    public GameMenuView(){
        super("\n"
                + "\n------------------------------------"
                + "\n   Help Menu"
                + "\n------------------------------------"
                + "\nD -- Discribe the word"
                + "\nF -- Show the first letter of the word"
                + "\nW -- Call the wizard to show the formula for calculation"
                + "\nM -- Return to Main Menu"
                + "\nQ -- Quit the game"
                + "\n------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); 
        
        switch (value) {
            case "D":  // create and start a new game
                this.describeWord();
                break;
            case "F":  // get and start an existing game
                this.firstLetter();
                break;
            case "W":  // display the help menu
                this.callWizzard();
                break;
            case "M":  // display the help menu
                this.mainMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try agin");
                break;
        }
        return false;
    }

    private void describeWord() {
        System.out.println("*** describeWord function called ***");
    }

    private void firstLetter() {
        System.out.println("*** firstLetter function called ***");
    }

    private void callWizzard() {
        System.out.println("*** callWizzard function called ***");
    }

    private void mainMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
