/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.model;

import java.io.Serializable;

/**
 *
 * @author Yura
 */
public class MathAssignment extends Activity implements Serializable{
    
    // class variables
    private int playerResult;
    private int gameResult;

    // constractor, setters, and getters
    public MathAssignment() { super(); }

    public void setPlayerResult(int playerResult) {
        this.playerResult = playerResult;
    }

    public void setGameResult(int gameResult) {
        this.gameResult = gameResult;
    }

    public int getPlayerResult() {
        return playerResult;
    }

    public int getGameResult() {
        return gameResult;
    }
    
    // hash, equls, and toString

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.playerResult;
        hash = 59 * hash + this.gameResult;
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
        final MathAssignment other = (MathAssignment) obj;
        if (this.playerResult != other.playerResult) {
            return false;
        }
        if (this.gameResult != other.gameResult) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Math{" + "playerResult=" + playerResult + ", gameResult=" + gameResult + '}';
    }
    
}
