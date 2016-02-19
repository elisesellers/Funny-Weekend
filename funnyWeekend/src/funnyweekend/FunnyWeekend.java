/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funnyweekend;

import byui.CIT260.funnyWeekend.model.Activity;
import byui.CIT260.funnyWeekend.model.Describe;
import byui.CIT260.funnyWeekend.model.Game;
import byui.CIT260.funnyWeekend.model.MathAssignment;
import byui.CIT260.funnyWeekend.model.Player;
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
    
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        FunnyWeekend.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        FunnyWeekend.player = player;
    }

    public static void main(String[] args) {
        
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.displayStartProgramView();
    }
    
}
