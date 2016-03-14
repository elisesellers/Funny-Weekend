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
public class Wizard implements Serializable{

    // class variables
    private String formula;
    
    // constractor, setters, and getters
    public Wizard() {
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getFormula() {
        return formula;
    }
    
    // hash, equals, and toString

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.formula);
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
        final Wizard other = (Wizard) obj;
        if (!Objects.equals(this.formula, other.formula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Wizard{" + "formula=" + formula + '}';
    }
    
}
