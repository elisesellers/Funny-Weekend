package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.CalculationControl;
import byui.CIT260.funnyWeekend.exceptions.CalculationControlException;
import java.util.Scanner;

/**
 *
 * @author Yura
 */
public class View33 extends View{

    private String view33;
    private String prompt = "\nPlease enter the temperature in Celsius: ";
    private CalculationControl converter = new CalculationControl(); 
    
    // constructor
    public View33(){ 
            super("\n"
                + "\n------------------------------------"
                + "\n   Sunday Math"
                + "\n------------------------------------"
                + "\nYour grandmar will call her friends in Rome today."
                + "\nShe wants to tell them the Rexburrg temperature, but she needs it in Celsius."
                + "\nIt was 28 degrees of Fahrenheit in Rexburg this morning."
                + "\nThe grandmar wants you to convert the temperature into Celsius."
                + "\n------------------------------------");
    }
     
    @Override
    public boolean doAction(String playerPass) {
        int playerT;
        try{
            Integer.parseInt(playerPass);
        }catch (NumberFormatException nf){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number.");
        }
        playerT=Integer.parseInt(playerPass);
        // keep comparing until getting the right answer
        boolean rightAnswer = false;
        // get the correct converted temperature and compare with the user input
        int tem;
        try{
            tem = converter.convertTemp(28);
            if (tem == playerT){
            this.console.println("\nThis is the right temperature!");
            rightAnswer = true;
        }
        else{
            this.console.println("\nThis is not the right temperature!");
            this.console.println("\nHere is the convertion formular C = (F - 32) * 5 / 9");
            this.console.println("\nTry again and please: ");
        }
        }catch(CalculationControlException cce){
                ErrorView.display(this.getClass().getName(), cce.getMessage());
        }
        
        return rightAnswer;
    }

   
}
