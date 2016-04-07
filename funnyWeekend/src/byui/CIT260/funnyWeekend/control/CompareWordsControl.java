package byui.CIT260.funnyWeekend.control;

import byui.CIT260.funnyWeekend.exceptions.CompareWordsControlException;
import byui.CIT260.funnyWeekend.model.Game;
import funnyweekend.FunnyWeekend;

/**
 *
 * @author Yura
 */
public class CompareWordsControl {
    /**This compares the passed word with the game word and returns true 
       if the words are same and false if they are not*/
    public static boolean compareWords(String playerWord, int assignmentNumber) throws CompareWordsControlException{
        
        if ("".equals(playerWord))
            throw new CompareWordsControlException("You need to input the word");
        boolean match = false;
        String[][] words = FunnyWeekend.getCurrentGame().getWords();
        
        for (int j = 0; j < words[0].length; j++){
            if (words[assignmentNumber][j].equals(playerWord)){
                match = true;
                break;
            }
        }
        return match;
    } 
}
