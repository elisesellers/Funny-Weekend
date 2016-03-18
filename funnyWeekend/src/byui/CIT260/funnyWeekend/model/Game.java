package byui.CIT260.funnyWeekend.model;

import static funnyweekend.FunnyWeekend.main;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Yura
 */
public class Game implements Serializable{
    private double totalScore;
    
    // list of players 
    private ArrayList<Player> players;
    // array of answers for CalculationControl
    private int[] numbers = {12, 13, 14};

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public String[][] getWords() {
        return words;
    }
    // two dimentional array for ComparreWords
    private String[][] words = {
        {"teacher", "book", "pen", "classmate", "desk", "lesson", "grade", "gym", "math", "break"},
        {"friend", "runners", "scarf", "hat", "trees", "gloves", "boots", "coat", "hill", "snow"},
        {"bear", "moose", "bird", "buffalo", "rabbit", "mountain lion", "fly", "mouse", "snake", "squirrel"},
        {"bed", "lamp", "toy", "window", "picture", "drawers", "desk", "clothes", "blanket", "pillow"},
        {"speaker", "chapel", "sacrament", "bishop", "Jesus", "story", "scriptures", "prayer", "song", "teacher"},
        {"bowl", "napkin", "spoon", "vegetables", "meat", "drink", "fork", "plate", "family", "potatoes"},
        };

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.totalScore) ^ (Double.doubleToLongBits(this.totalScore) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalScore=" + totalScore + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalScore) != Double.doubleToLongBits(other.totalScore)) {
            return false;
        }
        return true;
    }
    
    public Game() {
    }
    
    
}
