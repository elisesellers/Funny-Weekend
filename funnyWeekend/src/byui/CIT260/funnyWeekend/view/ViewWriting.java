package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.CompareWordsControl;
import byui.CIT260.funnyWeekend.exceptions.CompareWordsControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yura
 */
public class ViewWriting extends View{

    private CompareWordsControl words = new CompareWordsControl();
    private int assignmentNumber = -1;
    
    public ViewWriting(int assignmentNumber) {

        super();
        this.console.println("\n"
                + "\n---------------------------------"
                + "\n Friday Morning"
                + "\n---------------------------------"
                + "\nThis is Friday morning and you are at school."
                + "\nI want you to write down 5 names of things and 5 names of people "
                + "\nyou meet every school day (one word for one prompt). "
                + "\nAll words start with low case letter.  There must be no typos."
                + "\nThe program will keep prompting you until you enter all 10 words correctly."
                + "\n---------------------------------"
                + "\nInput 'yes' if you want to continue: ");
        this.assignmentNumber = assignmentNumber;
    }

    @Override
    public boolean doAction(String value) {
        this.displayMessage = "Input the word: ";
        this.doView11();
        return true;
    }
    
    void doView11(){
        boolean match;
        String playerGuess;
        for (int i = 0; i < 10; i++){
            match = false;
            while (!match){
                playerGuess = this.getInput();
                try {
                    if (words.compareWords(playerGuess)){
                        this.console.println("\nRight guess!\n");
                        match = true;
                    }
                    else{
                        this.console.println("\nThe guess is wrong\n");
                    }
                } catch (CompareWordsControlException cwce) {
                    this.console.println(cwce.getMessage());
                }
            }
        }
    }
}

