/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yura
 */
public class CompareWordsControlTest {
    
    public CompareWordsControlTest() {
    }

    /**
     * Test of compareWords method, of class CompareWordsControl.
     */
    @Test
    public void testCompareWords() {
        System.out.println("compareWords");
        
        /**
        * Test 1.
        */
        String gameWord = "teacher";
        String playerWord = "teacher";
        boolean expResult = true;
        //boolean result = CompareWordsControl.compareWords(playerWord);
        //assertEquals(expResult, result);
        
        /**
        * Test 2.
        */
        gameWord = "teacher";
        playerWord = "pupil";
        expResult = false;
        //result = CompareWordsControl.compareWords(playerWord);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
