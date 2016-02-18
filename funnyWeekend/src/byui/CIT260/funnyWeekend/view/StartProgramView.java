/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.view;

/**
 *
 * @author Yura
 */
public class StartProgramView {
    
    private String promptMessage;

    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name: ";
        
        this.displayBanner();
    }

    private void displayBanner() {
        
        System.out.println(
        "\n*******************************************"
      + "\n*                                         *"
      + "\nHi.  My name is Processor.  I live in this computer.  "
      + "\nI would like to play a game with you.  "
      + "\nIn this game you will be picking days and "
      + "\nwriting the names of things and people you meet on those days.  "
      + "\nYou input one word at a time.  "
      + "\nI have my set of words, and the word you input has to match "
      + "\nwith the one of mines.  No typos will be accepted!"
      + "\nYou can call for help, but getting the help will cost you points."
      + "\nYou can go through the days the way you like by using "
      + "\nthe inputs from the location menu.  "
      + "\nYou can save and return to your game any time."
      + "\n*                                         *"
      + "\n*******************************************"  
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do{
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))//user wants to quit
                return; //exit the game
            
            //do the requested action and isplaty the next view
            done = this.doAction(playersName);
            
        }while (!done);
    }

    private String getPlayersName() {
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

    private boolean doAction(String playersName) {
        System.out.println("\n*** doAction() call ***");
        return true;
    }
    
}
