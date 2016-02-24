/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.view;

/**
 *
 * @author Ellie
 */
public class View13 {
    public View13(){
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
        "\n***************************************"
                + "\nWelcome to Friday Math!"
                + "\nYou took a test today in school"
                + "\nand your friends all got different scores."
                + "\nEnter the scores of your five friends. "
                + "\nThe numbers have to be between 0 and 100."
                + "\n***************************************"
        );
    }
}
