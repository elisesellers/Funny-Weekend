/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.control;

/**
 *
 * @author Yura
 */
public class CompareWordsControl {
    
    /**This compares the passed word with the game word and returns true 
       if the words are same and false if they are not*/
    public static boolean compareWords(String gameWord, String playerWord){
        
        boolean match = false;

        if (gameWord.equals(playerWord))
            match = true;
        
        return match;
    }
    
}
