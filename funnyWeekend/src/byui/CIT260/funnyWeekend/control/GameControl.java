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
        
        Player player = new Player(name);
        
        FunnyWeekend.setPlayer(player); //save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("*** createNewGame stub function called ***");
    } 
    
}
