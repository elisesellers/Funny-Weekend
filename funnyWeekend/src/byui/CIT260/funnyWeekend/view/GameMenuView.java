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
        value = value.toUpperCase(); 
        
        switch (value) {
            case "11":
                this.doFridayMorning();
                break;
            case "13":
                this.doFridayMath();
                break;
            case "33":
                this.doSundayMath();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try agin");
                break;
        }
        return false;
    }
    
    private void doFridayMorning() {
        View11 view11 = new View11();
        view11.doFridayMorning();
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
