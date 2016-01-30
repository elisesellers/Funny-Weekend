/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Yura
 */
public class Writing extends Activity implements Serializable{
    
    // class variables
    private String playerWord;
    private String gameWord;
    
    // constractor, setters, and getters
    public Writing() { super(); }

    public void setPlayerWord(String playerWord) {
        this.playerWord = playerWord;
    }

    public void setGameWord(String gameWord) {
        this.gameWord = gameWord;
    }

    public String getPlayerWord() {
        return playerWord;
    }

    public String getGameWord() {
        return gameWord;
    }
    
    // hash, equals, and toString
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.playerWord);
        hash = 97 * hash + Objects.hashCode(this.gameWord);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Writing other = (Writing) obj;
        if (!Objects.equals(this.playerWord, other.playerWord)) {
            return false;
        }
        return Objects.equals(this.gameWord, other.gameWord);
    }

    @Override
    public String toString() {
        return "Writing{" + "playerWord=" + playerWord + ", gameWord=" + gameWord + '}';
    }
     
}
