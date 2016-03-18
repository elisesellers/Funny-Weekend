package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.CompareWordsControl;

/**
 *
 * @author Yura
 */
public class View11 extends View{

    private CompareWordsControl words = new CompareWordsControl();
    
    public View11() {

        super();
        System.out.println("\n"
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
    }

    @Override
    public boolean doAction(String value) {
        this.displayMessage = "Input the word: ";
        this.doView11();
        return true;
    }
    
    void doView11(){
        
        for (int i = 0; i < 10; i++){
            boolean match = false;
            String playerGuess;
            while (!match){
                playerGuess = this.getInput();
                if (words.compareWords(playerGuess)){
                    System.out.println("\nRight guess!\n");
                    match = true;
                }
                else{
                    System.out.println("\nThe guess is wrong\n");
                }
            }
        }
    }
}

