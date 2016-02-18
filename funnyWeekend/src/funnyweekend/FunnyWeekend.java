/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funnyweekend;

import byui.CIT260.funnyWeekend.model.Activity;
import byui.CIT260.funnyWeekend.model.Describe;
import byui.CIT260.funnyWeekend.model.MathAssignment;
import byui.CIT260.funnyWeekend.model.Wizard;
import byui.CIT260.funnyWeekend.model.Writing;
import byui.CIT260.funnyWeekend.view.StartProgramView;

/**
 *
 * @author Yura
 */
public class FunnyWeekend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.displayStartProgramView();
    }
    
}
