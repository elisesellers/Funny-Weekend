/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.view;

import funnyweekend.FunnyWeekend;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Yura
 */
public abstract class View implements ViewInterface{
    protected String displayMessage;
    
    protected final BufferedReader keyboard = FunnyWeekend.getInFile(); 
    protected final PrintWriter console = FunnyWeekend.getOutFile();
    
    public View(){    }
    
    public View(String message){
        this.displayMessage= message;
    }
    
    @Override
    public void display(){
        boolean done = false;
        do{
            //prompt for and get players name
            String value = this.getInput();
            if(value.toUpperCase().equals("Q"))//user wants to quit
                return; //exit the view
            
            //do the requested action and display the next view
            done = this.doAction(value);
            
        }while (!done); //exit the view when done == true
    }
    
    @Override
    public String getInput() {
        //Scanner keyboard = new Scanner(System.in);//get inflile for keyboard
        String value = null; //value to be returned
        boolean valid = false; // initalize to not valid
        
        try{
            while (!valid) {
                this.console.println("\n" + this.displayMessage);
                value = this.keyboard.readLine(); //get next line typed on keyboard
                value = value.trim(); //trim off leading and trailing blanks
            
                if (value.length()<1){
                    ErrorView.display(this.getClass().getName(), "\n***You must enter a value ***");
                    continue;
                }
                break; //end the loop
            }
        }catch (Exception te){
            ErrorView.display(this.getClass().getName(), "Error reading input: " + te.getMessage());
        }
        
        return value; //return the value entered
    }    
}
