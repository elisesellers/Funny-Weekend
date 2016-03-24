package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.GameControl;
import byui.CIT260.funnyWeekend.model.Player;
import java.util.Scanner;

/**
 *
 * @author Yura
 */
public class StartProgramView extends View {

    public StartProgramView() {

        super("\n*******************************************"
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
                + "\nPlease enter your name: "
        );

    }

    @Override
    public boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            ErrorView.display(this.getClass().getName(), "\nInvalid players name; "
                    + "The name must be greater than one character in length.");
            return false;
        }

        //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);

        if (player == null) {
            ErrorView.display(this.getClass().getName(), "\nError creating the player");
            return false;
        }

        //display next vie
        this.displayNextView(player);

        return true;
    }

    private void displayNextView(Player player) {
        this.console.println("\n================================="
                + "\n Welcome to the game " + player.getPlayerName()
                + "\n We hope you have a lot of fun!"
                + "\n================================="
        );
        //create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        //display the main menu view
        mainMenuView.display();
    }

}
