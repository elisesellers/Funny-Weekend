package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.CompareWordsControl;
import byui.CIT260.funnyWeekend.exceptions.CompareWordsControlException;
import byui.CIT260.funnyWeekend.model.Game;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yura
 */
public class ViewWriting extends View{

    private CompareWordsControl words = new CompareWordsControl();
    private Game gameWords = new Game();
    private int assignmentNumber = -1;
    
    public ViewWriting(int assignmentNumber) {

        super();
        switch (assignmentNumber){
            case 0:
                this.console.println("\n"
                    + "\n---------------------------------"
                    + "\n Friday Morning"
                    + "\n---------------------------------"
                    + "\nThis is Friday morning and you are at school."
                    + "\nI want you to write down 5 names of things and 5 names of people "
                    + "\nyou meet every school day (one word for one prompt). "
                    + "\nAll words start with low case letter.  There must be no typos."
                    + "\nThe program will keep prompting you until you enter all 10 words correctly."
                    + "\nIF YOU ARE TIRED WITH GUESSING, type 'print words' to see the words for this assignment"
                    + "\n---------------------------------"
                    + "\nInput 'yes' if you want to continue: ");
                break;
            case 1:
                this.console.println("\n"
                    + "\n---------------------------------"
                    + "\n Friday Afternoon"
                    + "\n---------------------------------"
                    + "\nThis is Friday afternoon and you go sledging with friends."
                    + "\nI want you to write down 10 names of things and people "
                    + "\nyou meet while sledging (one word for one prompt). "
                    + "\nAll words start with low case letter.  There must be no typos."
                    + "\nThe program will keep prompting you until you enter all 10 words correctly."
                    + "\nIF YOU ARE TIRED WITH GUESSING, type 'print words' to see the words for this assignment"
                    + "\n---------------------------------"
                    + "\nInput 'yes' if you want to continue: ");
                break;
            case 2:
                this.console.println("\n"
                    + "\n---------------------------------"
                    + "\n Saturday Morning"
                    + "\n---------------------------------"
                    + "\nThis is Saturday morning and you visit the Bear World."
                    + "\nI want you to write down 10 names of animals "
                    + "\nthat live in the Bear World (one word for one prompt). "
                    + "\nAll words start with low case letter.  There must be no typos."
                    + "\nThe program will keep prompting you until you enter all 10 words correctly."
                    + "\nIF YOU ARE TIRED WITH GUESSING, type 'print words' to see the words for this assignment"
                    + "\n---------------------------------"
                    + "\nInput 'yes' if you want to continue: ");
                break;
            case 3:
                this.console.println("\n"
                    + "\n---------------------------------"
                    + "\n Saturday Evening"
                    + "\n---------------------------------"
                    + "\nThis Saturday evening you are are doing the homework at home."
                    + "\nI want you to write down 10 names of things "
                    + "\nchildren have in there rooms (one word for one prompt). "
                    + "\nAll words start with low case letter.  There must be no typos."
                    + "\nThe program will keep prompting you until you enter all 10 words correctly."
                    + "\nIF YOU ARE TIRED WITH GUESSING, type 'print words' to see the words for this assignment"
                    + "\n---------------------------------"
                    + "\nInput 'yes' if you want to continue: ");
                break;
            case 4:
                this.console.println("\n"
                    + "\n---------------------------------"
                    + "\n Sunday Morning"
                    + "\n---------------------------------"
                    + "\nAs always, you go to the church every Sunday morning."
                    + "\nI want you to write down 10 commong words"
                    + "\nyou encounter day in the curch(one word for one prompt). "
                    + "\nAll words start with low case letter.  There must be no typos."
                    + "\nThe program will keep prompting you until you enter all 10 words correctly."
                    + "\nIF YOU ARE TIRED WITH GUESSING, type 'print words' to see the words for this assignment"
                    + "\n---------------------------------"
                    + "\nInput 'yes' if you want to continue: ");
                break;
            case 5:
                this.console.println("\n"
                    + "\n---------------------------------"
                    + "\n Sunday Afternoon"
                    + "\n---------------------------------"
                    + "\nThis is Sunday Afternoon and you are having dinner with the family."
                    + "\nI want you to write down 10 words"
                    + "\nthat will be on the table at the dinner (one word for one prompt). "
                    + "\nAll words start with low case letter.  There must be no typos."
                    + "\nThe program will keep prompting you until you enter all 10 words correctly."
                    + "\nIF YOU ARE TIRED WITH GUESSING, type 'print words' to see the words for this assignment"
                    + "\n---------------------------------"
                    + "\nInput 'yes' if you want to continue: ");
                break;
        }    
        this.assignmentNumber = assignmentNumber;
    }

    @Override
    public boolean doAction(String value) {
        this.displayMessage = "Input the word: ";
        this.doViewWriting();
        return true;
    }
    
    void doViewWriting(){
        boolean match;
        String playerGuess;
        for (int i = 0; i < 10; i++){
            match = false;
            while (!match){
                playerGuess = this.getInput();
                try {
                    if (words.compareWords(playerGuess, this.assignmentNumber)){
                        this.console.println("\nRight guess!\n");
                        match = true;
                    }
                    else if (playerGuess.equalsIgnoreCase("print words")){
                        String wordsToDisplay[][] = gameWords.getWords();
                        this.console.println("\n*Here are the words for this assignment*");
                        for (int i1 = 0; i1 < 10; i1++){
                            this.console.println(wordsToDisplay[this.assignmentNumber][i1]);
                        }
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

