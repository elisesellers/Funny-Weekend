package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.CalculationControl;
import java.util.Scanner;

/**
 *
 * @author Yura
 */
public class View33 {

    private String view33;
    private String promptMessage = "\nPlease enter your choice: ";
    private CalculationControl converter = new CalculationControl(); 
    
    // constructor
    public View33(){ 
            this.view33 = "\n"
                + "\n------------------------------------"
                + "\n   Sunday Math"
                + "\n------------------------------------"
                + "\nYour grandmar will talk with friends in Rome today."
                + "\nShe wants to tell them the Rexburrg temperature, but she needs it in Celsius."
                + "\nIt was 28 degrees of Fahrenheit in Rexburg that morning."
                + "\nThe grandmar wants you to convert the temperature into Celsius."
                + "\nWould you like to help her?"
                + "\nY -- yes"
                + "\nQ -- no"
                + "\n------------------------------------";
    }
    
    // displays the start progrm view
    void displayView33() {
        
        boolean done = false; // set flag to not done
        
        System.out.println(view33);
        do{
            // prompt for and get the player's choice
            String playerChoice = this.getPlayerCoice();
            if (playerChoice.toUpperCase().equals("N")) // user wants to quit
                return; // return to the main menu
            
            // do the requested action 
            done = this.doAction(playerChoice);
            
        } while(!done);
    } 

    private String getPlayerCoice() {
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

    private boolean doAction(String playerChoice) {
        playerChoice = playerChoice.toUpperCase();
        Scanner keyboard = new Scanner(System.in);//get inflile for keyboard
        String playerTemperature;
        
        if (playerChoice == "Y"){
            this.compareTemperature();
            return true;   
        }
        return false;
    }

    private void compareTemperature() {
        
        
        // keep comparing until getting the right answer
        boolean rightAnswer = false;
        while (rightAnswer == false){
            // get the correct converted temperature and compare with the user input
            int playerT = this.getTemperature();
            if (converter.convertTemp(28) == playerT){
                System.out.println("\nThis is the right temperature!");
                rightAnswer = true;
            }
            else{
                System.out.println("\nThis is not the right temperature!");
                System.out.println("\nHere is the convertion formular C = (F - 32) * 5 / 9");
                System.out.println("\nTry again and please: ");
            }  
    }
}

    private int getTemperature() {
        String playerTemperature;
        System.out.println("\nPlease enter the converted temperature: ");
        Scanner keyboard = new Scanner(System.in);//get inflile for keyboard
        playerTemperature = keyboard.nextLine(); //get next line typed on keyboard
        playerTemperature = playerTemperature.trim(); //trim off leading and trailing blanks
        int tempC = Integer.parseInt(playerTemperature);
        
        return tempC;
    }
}
