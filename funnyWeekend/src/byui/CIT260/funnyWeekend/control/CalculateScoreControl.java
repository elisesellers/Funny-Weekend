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
public class CalculateScoreControl {
    /**This sums up the obtained score to the total score*/
    public static int calculateScore(int totalScore, int currentScore){
        
        totalScore += currentScore;
        
        return totalScore;
    }
}
