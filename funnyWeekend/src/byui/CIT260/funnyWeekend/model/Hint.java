/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.model;

import java.util.Objects;

/**
 *
 * @author Lony
 */
public class Hint {
    
    private String gameWord;

    public String getGameWord() {
        return gameWord;
    }

    public void setGameWord(String gameWord) {
        this.gameWord = gameWord;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.gameWord);
        return hash;
    }

    @Override
    public String toString() {
        return "Hint{" + "gameWord=" + gameWord + '}';
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
        final Hint other = (Hint) obj;
        if (!Objects.equals(this.gameWord, other.gameWord)) {
            return false;
        }
        return true;
    }

    public Hint() {
    }
    
    
}
