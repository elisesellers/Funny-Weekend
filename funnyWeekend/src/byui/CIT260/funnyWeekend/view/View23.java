/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.CalculationControl;
import static byui.CIT260.funnyWeekend.control.CalculationControl.calculateAverage;
import byui.CIT260.funnyWeekend.exceptions.CalculationControlException;
import funnyweekend.FunnyWeekend;


/**
 *
 * @author Ellie
 */
public class View23 extends View{
    private String view23;
    private String prompt;
    private CalculationControl total = new CalculationControl();
    
    
    public View23(){
    super("\n"
            + "\n------------------------------------------------"
            + "\nSaturday Math"
            + "\n------------------------------------------------"
            + "\nYou just got home from Bear World."
            + "\nYou saw three bears. The biggest bear weighed 1,042 pounds."
            + "\nThe second bear weighed 556 pounds. The last bear was just a cub"
            + "\nand weighed 80 pounds. What is the weight of all of the bears"
            + "\nput together?"
            + "\n------------------------------------------------"
            + "\nPlease enter the total weight of all of the bears:");
    }

    @Override
    public boolean doAction(String playerPass) {
    this.console.println(view23);
        double playerTotal;

        // keep comparing until getting the right answer

        boolean rightAnswer = true;
        do{
            try{
                playerTotal=Double.parseDouble(playerPass);
            }catch(NumberFormatException nf){
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number.");
                return false;
            }
            // get the correct average and compare with the user input
            double total;
            try{
                total = CalculationControl.calculateTotal(FunnyWeekend.getCurrentGame().getWeight());
                if (total == playerTotal){
                this.console.println("\nThis is the right total!");
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
