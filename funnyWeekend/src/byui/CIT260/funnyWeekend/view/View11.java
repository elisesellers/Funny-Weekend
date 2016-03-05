package byui.CIT260.funnyWeekend.view;

import byui.CIT260.funnyWeekend.control.CompareWordsControl;

/**
 *
 * @author Yura
 */
public class View11 extends View{

    private String view13;
    private CompareWordsControl words = new CompareWordsControl();
    
    public View11() {

        this.view13 = "\n"
                + "\n---------------------------------"
                + "\n Friday Morning"
                + "\n---------------------------------"
                + "\nThis is Friday morning and you are at school."
                + "\nI want you to write down 5 names of things and 5 names of people "
                + "\nyou meet every school day (one word for one prompt). "
                + "\nAll words start with low case letter.  There must be no typos."
                + "\n---------------------------------";
    }

    @Override
    public boolean doAction(String playerPass) {
        
        words.compareWords();
        
        return false;
    }
}

