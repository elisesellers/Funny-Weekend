package byui.CIT260.funnyWeekend.control;

import byui.CIT260.funnyWeekend.exceptions.CompareWordsControlException;
import byui.CIT260.funnyWeekend.model.Game;

/**
 *
 * @author Yura
 */
public class CompareWordsControl {
    boolean match = false;
    private Game game = new Game();
    /**This compares the passed word with the game word and returns true 
       if the words are same and false if they are not*/
    public boolean compareWords(String playerWord) throws CompareWordsControlException{
        
        if ("".equals(playerWord))
            throw new CompareWordsControlException("You need to input the word");
        
        String[][] words = game.getWords();
        
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 10; j++){
                if (words[i][j].equals(playerWord)){
                    match = true;
                    break;
                }
            }
        return match;
    }
    
}
