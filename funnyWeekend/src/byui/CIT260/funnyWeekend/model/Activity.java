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
public class Activity implements Serializable{
    
    // class variables
    private int location;

    public Activity() {
    }
    
    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.location;
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
        final Activity other = (Activity) obj;
        if (this.location != other.location) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Activity{" + "location=" + location + '}';
    }
    
    
    
}
