/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.control;

import byui.CIT260.funnyWeekend.exceptions.CalculationControlException;
import byui.CIT260.funnyWeekend.model.Game;

/**
 *
 * @author Ellie
 */
public class CalculationControl {
    private Game gameNumbers = new Game();
    /**This calculates an average, a total, and converts a temperature in F t*/
    public static int convertTemp(int tempF) throws CalculationControlException{
        if (tempF<-50)
            throw new CalculationControlException("Temperature should be greater than "
                    + "-50 degrees.");
        if (tempF>150)
            throw new CalculationControlException("Temperature should be less than "
                    + "150 degrees.");
        int tempC;
        tempC = ((tempF-32)*5)/9;
        
        return tempC;
    }
    
    public static int calculateAverage() throws CalculationControlException{
            int list []={88, 93, 95, 98, 83, 98, 95};
            int length =7;
        if (length<=0)
            throw new CalculationControlException("You must enter numbers.");
        for ( int i=0; i<length; i++){
            if (list[i]<0)
                throw new CalculationControlException("The numbers cannot be less than 0.");
            if (list[i]>100)
                throw new CalculationControlException("The numbers cannot be greater"
                        + " than 100.");
        }
        int average;
        int total = 0;
        for (int i=0; i<length; i++)
            total+=list[i];
        average= total/length;
        return average;
    } 
    
    public static double calculateTotal
        (double weight [], int length) throws CalculationControlException{
        if (length<=0)
            throw new CalculationControlException("You must enter numbers.");
        for (int i=0; i<length; i++)
            if (weight[i]<0)
                throw new CalculationControlException("The numbers cannot be less than 0.");
        
        double total = 0;
        for (int i=0; i<length; i++)
            total+=weight[i];
        
        return total;
    } 
}
