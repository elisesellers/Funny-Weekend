package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.CalculationControl;
import static byui.CIT260.funnyWeekend.control.CalculationControl.calculateAverage;
import java.util.Scanner;

/**
 *
 * @author Ellie
 */
public class View13 extends View{
    private String view13;
    private String prompt;
    private CalculationControl average = new CalculationControl();
    //constructor
    public View13(){
        this.view13 = "\n"
                + "\n---------------------------------"
                + "\n Friday Math "
                + "\n---------------------------------"
                + "\nYou took a test today in school"
                + "\nand your friends all got different scores."
                + "\nYour friends received scores of:"
                + "\n88, 93, 95, 98, 83, 98, and 95."
                + "\nCalculate the average of the scores received."
                + "\n---------------------------------"
                + "\nPlease enter the average score:";
    }

    // displays the start progrm view

    @Override
    public boolean doAction(String playerPass) {
        int playerAverage=Integer.parseInt(playerPass);

        // keep comparing until getting the right answer

        boolean rightAnswer = true;
        do{
            // get the correct average and compare with the user input
            if (average.calculateAverage() == playerAverage){
                System.out.println("\nThis is the right average!");
            }
            else{
                System.out.println("\nThis is not the right average!");
                System.out.println("\nHere is the formula to find the average:"
                    + "\n add all of the numbers together and divide by how many numbers you have."
                    + "(a+a+a+a)/4");
                System.out.println("\nTry again and please: ");
                rightAnswer = false;
            }
        }while(rightAnswer == false); 
        
        return rightAnswer;
    }
}
