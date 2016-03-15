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
public class Describe implements Serializable{
    
    // class variables
    private String wordDescription; 
    
    // constractor, setters, and getters
    public Describe() {
    }

    public void setWordDescription(String wordDescription) {
        this.wordDescription = wordDescription;
    }

    public String getWordDescription() {
        return wordDescription;
    }
    
    // hash, equals, and toString

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.wordDescription);
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
        final Describe other = (Describe) obj;
        if (!Objects.equals(this.wordDescription, other.wordDescription)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Describe{" + "wordDescription=" + wordDescription + '}';
    }
    
}
