package byui.CIT260.funnyWeekend.control;

import byui.CIT260.funnyWeekend.model.Game;
import byui.CIT260.funnyWeekend.model.Player;
import byui.CIT260.funnyWeekend.exceptions.GameControlException;
import funnyweekend.FunnyWeekend;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
    
    public static void saveGame(Game game, String filepath) throws GameControlException{
        try(FileOutputStream fops = new FileOutputStream(filepath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(game);  // write the game object out to file
        }catch (Exception e){
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void getSavedGame(String filepath) throws GameControlException{
        
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filepath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file 
        }catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        // close the output file
        FunnyWeekend.setCurrentGame(game); // save in FunnyWeekend
    }

    public static void mathAnswers(Game currentGame, String filePath) {
        String inputLocation = null;
        String outputLocation = null;
        try (BufferedReader in =
                new BufferedReader(new FileReader(inputLocation));
                BufferedWriter out = 
                        new BufferedWriter(new FileWriter(outputLocation))
                ) {
            String text;
            while((text = in.readLine()) !=null){
                out.write(text);
            }
        }catch(IOException ex){
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
}
