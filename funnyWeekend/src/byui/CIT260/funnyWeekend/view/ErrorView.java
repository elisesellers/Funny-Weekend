/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.view;

import funnyweekend.FunnyWeekend;
import java.io.PrintWriter;

/**
 *
 * @author Yura
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = FunnyWeekend.getOutFile();
    private static final PrintWriter logFile = FunnyWeekend.getLogFile();
 
    public static void display(String className, String errorMessage){
        
        errorFile.println(
                    "--------------------------------------------" +
                    "\n-  ERROR  -" + errorMessage +
                    "\n--------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
}
