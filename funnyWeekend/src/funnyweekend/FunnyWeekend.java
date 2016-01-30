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

/**
 *
 * @author Yura
 */
public class FunnyWeekend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // new objects and tests for them
        Activity activityOne = new Activity();
        
        activityOne.setLocation(11);
        String activityInfo = activityOne.toString();
        System.out.println(activityInfo);
        
        Writing writingOne = new Writing();
        
        writingOne.setPlayerWord("Rexburg");
        writingOne.setGameWord("Idaho Falls");
        String writingInfo = writingOne.toString();
        System.out.println(writingInfo);
        
        MathAssignment mathOne = new MathAssignment();
        
        mathOne.setPlayerResult(33);
        mathOne.setGameResult(33);
        String mathInfo = mathOne.toString();
        System.out.println(mathInfo);
        
        Describe describeOne = new Describe();
        
        describeOne.setWordDescription("This will describe the game word");
        String describeInfo = describeOne.toString();
        System.out.println(describeInfo);
        
        Wizard wizardOne = new Wizard();
        
        wizardOne.setFormula("Celsius = (Fahrenheit - 32) * 5 / 9");
        String wizardInfo = wizardOne.toString();
        System.out.println(wizardInfo);
    }
    
}
