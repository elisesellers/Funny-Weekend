/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.CalculationControl;
import static byui.CIT260.funnyWeekend.control.CalculationControl.calculateAverage;
import byui.CIT260.funnyWeekend.exceptions.CalculationControlException;


/**
 *
 * @author Ellie
 */
public class View23 extends View{
    private String view23;
    private String prompt;
    private CalculationControl total = new CalculationControl();
    
    
    public View23(){
    this.view23 = "\n"
            + "------------------------------------------------"
            + "Saturday Math"
            + "------------------------------------------------"
            + "You just got home from Bear World."
            + "You saw three bears. The biggest bear weighed 1,042 pounds."
            + "The second bear weighed 556 pounds. The last bear was just a cub"
            + "and weighed 80 pounds. What is the weight of all of the bears"
            + "put together?"
            + "------------------------------------------------"
            + "Please enter the total weight of all of the bears:";
    }

    @Override
    public boolean doAction(String playerPass) {
    this.console.println(view23);
        int playerTotal;

        // keep comparing until getting the right answer

        boolean rightAnswer = true;
        do{
            try{
                Integer.parseInt(getInput());
            }catch(NumberFormatException nf){
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number.");
            }
            playerTotal= Integer.parseInt(getInput());
            // get the correct average and compare with the user input
            double answer = 0;
            try{
                answer = total.calculateTotal;
                if (answer == playerTotal){
                this.console.println("\nThis is the right average!");
                }
                else{
                    this.console.println("\nThis is not the right total!");
                    this.console.println("\nHere is the formula to find the total:"
                        + "\n add all of the numbers together."
                        + "a+a+a+a");
                    this.console.println("\nTry again and please: ");
                    rightAnswer = false;
                }
            }catch(CalculationControlException cce){
                ErrorView.display(this.getClass().getName(), cce.getMessage());
            }
              
        }while(rightAnswer == false); 
        
        return rightAnswer;
    }
}
