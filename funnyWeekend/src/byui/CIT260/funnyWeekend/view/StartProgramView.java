/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.GameControl;
import byui.CIT260.funnyWeekend.model.Player;
import java.util.Scanner;
import static sun.audio.AudioPlayer.player;

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
      + "\nHello.  My name is Processor.  I live in this computer."
      + "\nI would like to play a game with you."
      + "\nIn this game you will be picking what days you would like to visit."
      + "\nEach day has an activity for you to do."
      + "\nOn some days you will need to write"
      + "\nthe names of things and people you might meet on those days."
      + "\nYou will type one word at a time.  "
      + "\nI have my set of words, and the word you type has to match "
      + "\nwith one of mine.  No typos will be accepted!"
      + "\nYou can call for help, but getting the help will cost you points."
      + "\nOther days will require you to solve a math problem."
      + "\nI will tell you the problem and you will type an answer."
      + "\nYour answer has to match mine."
      + "\nYou can ask the wizard for help, but he will take some of your points."
      + "\nYou can go through the days any way you like by using "
      + "\nthe inputs from the map menu.  "
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
        if (playersName.length()<2){
            System.out.println("\nInvalid players name; "
            + "The name must be greater than one character in length.");
            return false;
        }
        
        //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null){
            System.out.println("\nError creating the player");
            return false;
        }
        
        //display next vie
        this.displayNextView();
        
        return true;
    }

    private void displayNextView() {
        System.out.println("\n================================="
                           +"\n Welcome to the game " + player.getName()
                           +"\n We hope you have a lot of fun!"
                           +"\n================================="
                            );
        //create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        //display the main menu view
        mainMenuView.displayMainMenuView();
    }
    
}
