package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.CalculationControl;
import java.util.Scanner;

/**
 *
 * @author Yura
 */
public class View33 {

    private String view33;
    private String prompt = "\nPlease enter the temperature in Celsius: ";
    private CalculationControl converter = new CalculationControl(); 
    
    // constructor
    public View33(){ 
            this.view33 = "\n"
                + "\n------------------------------------"
                + "\n   Sunday Math"
                + "\n------------------------------------"
                + "\nYour grandmar will call her friends in Rome today."
                + "\nShe wants to tell them the Rexburrg temperature, but she needs it in Celsius."
                + "\nIt was 28 degrees of Fahrenheit in Rexburg this morning."
                + "\nThe grandmar wants you to convert the temperature into Celsius."
                + "\n------------------------------------";
    }
    
    // displays the start progrm view
    void displayView33() {
        
        boolean rightAnswer = false;
        int tempC;
        System.out.println(view33);
        
        do{
            System.out.println(prompt);
            // get the player's choice
            Scanner keyboard = new Scanner(System.in); //get inflile for keyboard
            String playerTemp = keyboard.nextLine();
            playerTemp = playerTemp.trim(); //trim off leading and trailing blanks
            tempC = Integer.parseInt(playerTemp); // convert to int
        
            rightAnswer = this.doAction(tempC);
        }while (!rightAnswer);
    } 
    
    
    

    private boolean doAction(int playerT) {
        // keep comparing until getting the right answer
        boolean rightAnswer = false;
        // get the correct converted temperature and compare with the user input
        if (converter.convertTemp(28) == playerT){
            System.out.println("\nThis is the right temperature!");
            rightAnswer = true;
        }
        else{
            System.out.println("\nThis is not the right temperature!");
            System.out.println("\nHere is the convertion formular C = (F - 32) * 5 / 9");
            System.out.println("\nTry again and please: ");
        }
        return rightAnswer;
    }
}
