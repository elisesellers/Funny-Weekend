/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funnyweekend;

import byui.CIT260.funnyWeekend.model.Game;
import byui.CIT260.funnyWeekend.model.Player;
import byui.CIT260.funnyWeekend.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yura
 */
public class FunnyWeekend {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Player> players;
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        FunnyWeekend.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        FunnyWeekend.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        FunnyWeekend.inFile = inFile;
    }

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

    public static ArrayList<Player> getPlayers() {
        return players;
    }

    public static void setPlayers(ArrayList<Player> players) {
        FunnyWeekend.players = players;
    }
    
    

    public static void main(String[] args) {
       
       
       try{
           // open character stream files for end user input and output
           FunnyWeekend.inFile = new BufferedReader(new InputStreamReader(System.in));
           FunnyWeekend.outFile = new PrintWriter(System.out, true);
           
           // open log file
           String filePath = "log.txt";
           FunnyWeekend.logFile = new PrintWriter(filePath);
           
           StartProgramView startProgramView = new StartProgramView();
           startProgramView.display();
            
           return;
       }catch (Throwable te){
           System.out.println("Exception: " + te.toString() +
                              "\nCouse: " + te.getCause() +
                               "\nMessage: " + te.getMessage());
           te.printStackTrace();
       }
       finally {
           try {
               if (FunnyWeekend.inFile != null)
                    FunnyWeekend.inFile.close();
               if (FunnyWeekend.outFile != null)
                    FunnyWeekend.outFile.close();
               if (FunnyWeekend.logFile != null)
                   FunnyWeekend.logFile.close();
           } catch (IOException ex) {
               System.out.println("Error closing files");
               return;
           }
       }
    }
    
}
