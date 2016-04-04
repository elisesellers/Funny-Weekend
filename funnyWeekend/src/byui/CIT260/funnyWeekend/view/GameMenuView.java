package byui.CIT260.funnyWeekend.view;

import funnyweekend.FunnyWeekend;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Yura
 */
public class GameMenuView extends View{
    
    public GameMenuView(){
        super("\n"
                + "\n------------------------------------"
                + "\n   Locations Menu"
                + "\n------------------------------------"
                + "\n11 -- Friday Morning"
                + "\n12 -- Friday Afternoon"
                + "\n21 -- Saturday Morning"
                + "\n22 -- Saturday Afternoon"
                + "\n31 -- Sunday Morning"
                + "\n32 -- Sunday Afternoon"
                + "\n13 -- Friday Math"
                + "\n23 -- Saturday Math"
                + "\n33 -- Sunday Math"
                + "\nWA -- Save and print out word answers"
                + "\nMA -- Save and print out math answers"
                + "\nQ -- Quit the game"
                + "\n------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        int assignmentNumber = -1;
        value = value.toUpperCase(); 
        
        switch (value) {
            case "11":
                assignmentNumber = 0;
                this.doWritingAssignment(assignmentNumber);
                break;
            case "12":
                assignmentNumber = 1;
                this.doWritingAssignment(assignmentNumber);
                break;
            case "21":
                assignmentNumber = 2;
                this.doWritingAssignment(assignmentNumber);
                break;
            case "22":
                assignmentNumber = 3;
                this.doWritingAssignment(assignmentNumber);
                break;
            case "31":
                assignmentNumber = 4;
                this.doWritingAssignment(assignmentNumber);
                break;
            case "32":
                assignmentNumber = 5;
                this.doWritingAssignment(assignmentNumber);
                break;
            case "13":
                this.doFridayMath();
                break;
            case "23":
                this.doSaturdayMath();
                break;
            case "33":
                this.doSundayMath();
                break;
            case "WA": // write the words answers to a file
                this.writeWordAnswers();
                break;
            case "MA":
                this.mathAnswers(FunnyWeekend.getCurrentGame().getNumbers());
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try agin");
                break;
        }
        return false;
    }
    
    private void doWritingAssignment(int assignmentNumber) {
        ViewWriting viewWriting = new ViewWriting(assignmentNumber);
        viewWriting.display();
    }
    
    private void doFridayMath() {
        View13 view13 = new View13();
        String playerAverage = this.getInput();
        view13.doAction(playerAverage);
    }

    private void doSundayMath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void doSaturdayMath() {
        View23 view23 = new View23();
        String playerTotal = this.getInput();
        view23.doAction(playerTotal);
    }
    private void writeWordAnswers() {
        // prompt for and get the name of the file to write the word answers
        this.console.println("\n\nEnter the file path for the file where the word answers will be written.");
        String filePath = this.getInput();
        
        try(PrintWriter out = new PrintWriter(filePath)){
            // print the header
            out.println("\n            -- Here are the word answers --             \n");
            /* for ever item in the list
                 print info about item;
            */
            String [][] wordAnswers = FunnyWeekend.getCurrentGame().getWords();
            for (int i = 0; i < 6; i++){
                out.println("Writing assignment #," + (i + 1) + ":  ");
                for (int i1 = 0; i1 < 10; i1++){
                    out.println(wordAnswers[i][i1] + ", ");
                }
                out.println("\n");
            }
            
        }catch(IOException ex){
            System.out.println("I/O error" + ex.getMessage());
        }
    }

   public void mathAnswers(int[] numbers) {
       FileWriter outFile = null;
       
       this.console.println("\n\nEnter the file path for the file where the word answers will be written.");
        String filePath = this.getInput();
        
        try (PrintWriter out = new PrintWriter(filePath)){
            
            out.println("\n\n           Math Answers           ");
            out.printf("%n%-20s%10s", "Location", "Answer");
            out.printf("%n%-20s%10s", "--------", "-------");
            
            for(int i = 0; i < numbers.length; i++){
                out.printf("%n%-20d%7d", i + ": ", numbers[i]);
                        
                out.println("\n");
            }
            
        }catch(IOException ex){
            System.out.println("I/O Error: " + ex.getMessage());
        }finally{
            if (outFile != null){
                try{
                    outFile.close();
                }catch (IOException ex2){
                    System.out.println("Error closing file.");
                }
            }
        }
    }
    
}
