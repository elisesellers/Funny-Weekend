/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.CalculationControl;
import static byui.CIT260.funnyWeekend.control.CalculationControl.calculateAverage;
import java.util.Scanner;

/**
 *
 * @author Ellie
 */
public class View13 {
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

    void displayView13() {

        boolean rightAnswer = false;
        int average;
        System.out.println(view13);        

        do{
            System.out.println(prompt);
            // get the player's choice
            Scanner keyboard = new Scanner(System.in); //get inflile for keyboard
            String playerAverage = keyboard.nextLine();
            playerAverage = playerAverage.trim(); //trim off leading and trailing blanks
            average = Integer.parseInt(playerAverage); // convert to int

            rightAnswer = this.doAction(average);

        }while (!rightAnswer);

    } 

    private boolean doAction(int playerAverage) {

        // keep comparing until getting the right answer

        boolean rightAnswer = false;

        // get the correct converted temperature and compare with the user input

        if (average.calculateAverage() == playerAverage){

            System.out.println("\nThis is the right average!");
            rightAnswer = true;

        }

        else{

            System.out.println("\nThis is not the right average!");

            System.out.println("\nHere is the formula to find the average:"
                    + "\n add all of the numbers together and divide by how many numbers you have."
                    + "(a+a+a+a)/4");

            System.out.println("\nTry again and please: ");

        }

        return rightAnswer;

    }
}
