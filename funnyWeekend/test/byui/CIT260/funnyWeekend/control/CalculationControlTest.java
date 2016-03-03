/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ellie
 */
public class CalculationControlTest {
    
    public CalculationControlTest() {
    }

    /**
     * Test of convertTemp method, of class CalculationControl.
     */
    @Test
    public void testConvertTemp() {
        System.out.println("convertTemp");
        double tempF = -51.0;
        double expResult = -100;
        double result = CalculationControl.convertTemp((int) tempF);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of calculateAverage method, of class CalculationControl.
     */
    @Test
    public void testCalculateAverage() {
        System.out.println("calculateAverage");
        int[] list ={88, 93, 95, 98, 83, 98, 95};
        int length = 7;

        int expResult = 93;
        int i = 0;
        int result = CalculationControl.calculateAverage();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of calculateTotal method, of class CalculationControl.
     */
    @Test
    public void testCalculateTotal() {
        System.out.println("calculateTotal");
        double[] list = {15, 45, 3.71};
        int length = 3;
        double expResult = 63.71;
        double result = CalculationControl.calculateTotal(list, length);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
