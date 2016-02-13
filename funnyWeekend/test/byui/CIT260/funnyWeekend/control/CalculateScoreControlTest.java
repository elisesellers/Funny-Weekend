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
public class CalculateScoreControlTest {
    
    public CalculateScoreControlTest() {
    }

    /**
     * Test of calculateScore method, of class CalculateScoreControl.
     */
    @Test
    public void testCalculateScore() {
        System.out.println("calculateScore");
        
        /**
        * Test case 1.
        */
        System.out.println("Test case 1.");
        int totalScore = 23;
        int currentScore = 3;
        int expResult = 26;
        int result = CalculateScoreControl.calculateScore(totalScore, currentScore);
        assertEquals(expResult, result);
        
        /**
        * Test case 2.
        */
        System.out.println("Test case 1.");
        totalScore = 19;
        currentScore = -2;
        expResult = 17;
        result = CalculateScoreControl.calculateScore(totalScore, currentScore);
        assertEquals(expResult, result);
        
        /**
        * Test case 2.
        */
        System.out.println("Test case 3.");
        totalScore = 0;
        currentScore = 0;
        expResult = 0;
        result = CalculateScoreControl.calculateScore(totalScore, currentScore);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
