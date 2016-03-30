package byui.CIT260.funnyWeekend.view;

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
                + "\n13 -- Friday Math"
                + "\n33 -- Sunday Math"
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
            case "33":
                this.doSundayMath();
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
    
}
