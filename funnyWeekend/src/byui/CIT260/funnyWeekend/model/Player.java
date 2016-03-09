/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.model;

import static java.nio.file.Files.move;
import java.util.Objects;

/**
 *
 * @author Ellie
 */
public class Player {
    private String playerName;
    private int playerScore;

    public Player(String playerName) {
        this.playerName = playerName;
        this.playerScore = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    
    
    
}
