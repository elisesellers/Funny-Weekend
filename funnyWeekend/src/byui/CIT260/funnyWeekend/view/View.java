/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.view;

import java.util.Scanner;

/**
 *
 * @author Yura
 */
public abstract class View implements ViewInterface{
    protected String displayMessage;
    
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
        Scanner keyboard = new Scanner(System.in);//get inflile for keyboard
        String value = null; //value to be returned
        boolean valid = false; // initalize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.displayMessage);
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length()<1){
                System.out.println("\n***You must enter a value ***");
                continue;
            }
            break; //end the loop
        }
        
        return value; //return the value entered
    }    
}
