package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.CompareWordsControl;

/**
 *
 * @author Yura
 */
public class View11 extends View{

    private String view11;
    private String prompt11 = "Input the word: ";
    private CompareWordsControl words = new CompareWordsControl();
    
    public View11() {

        this.view11 = "\n"
                + "\n---------------------------------"
                + "\n Friday Morning"
                + "\n---------------------------------"
                + "\nThis is Friday morning and you are at school."
                + "\nI want you to write down 5 names of things and 5 names of people "
                + "\nyou meet every school day (one word for one prompt). "
                + "\nAll words start with low case letter.  There must be no typos."
                + "\nThe program will keep prompting you until you enter all 10 words correctly."
                + "\n---------------------------------";
    }
    
    public void doFridayMorning(){
    
        System.out.println(this.view11);
        for (int i = 0; i < 10; i++){
            boolean match  = false;
            while (!match){
                System.out.println(this.prompt11);
                String playerWord = getInput();
                if (doAction(playerWord)){
                    System.out.println("\nWrightt word!!\n");
                    match = true;
                }
                else
                    System.out.println("\nYour word is wrong. Please try again.\n");
            }
        }
        System.out.println("\nCongratulations!!!  You made it through the Friday Morning!\n");
    }
    
    @Override
    public boolean doAction(String playerPass) {
        
        words.compareWords();
        
        return true;
    }
}

