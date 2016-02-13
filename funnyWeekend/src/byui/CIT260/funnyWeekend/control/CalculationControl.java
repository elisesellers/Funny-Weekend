/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.control;

/**
 *
 * @author Ellie
 */
public class CalculationControl {
    /**This calculates an average, a total, and converts a temperature in F t*/
    public static double convertTemp(double tempF){
        if (tempF<-50)
            return -100;
        if (tempF>150)
            return -200;
        double tempC;
        tempC = ((tempF-32)*5)/9;
        
        return tempC;
    }
    
    public static double calculateAverage
        (double list [], int length, int i){
        if (length<=0)
            return -1;
        for (i=0; i<length; i++){
            if (list[i]<0)
                return -2;
            if (list[i]>100)
                return -3;
        }
        double average;
        double total = 0;
        for (i=0; i<length; i++)
            total+=list[i];
        average= total/length;
        return average;
    } 
    
    public static double calculateTotal
        (double list [], int length){
        if (length<=0)
            return -1;
        for (int i=0; i<length; i++)
            if (list[i]<0)
                return -2;
        
        double total = 0;
        for (int i=0; i<length; i++)
            total+=list[i];
        
        return total;
    } 
}
