/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.control;

import byui.CIT260.funnyWeekend.model.Player;
import funnyweekend.FunnyWeekend;

/**
 *
 * @author Ellie
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        FunnyWeekend.setPlayer(player); //save the player
        
        return player;
    }
    
}
