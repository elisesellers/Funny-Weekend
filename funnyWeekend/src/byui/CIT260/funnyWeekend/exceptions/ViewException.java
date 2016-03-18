/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.exceptions;

/**
 *
 * @author Yura
 */
public class ViewException extends Exception{

    public ViewException() {
    }

    public ViewException(String string) {
        super(string);
    }

    public ViewException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ViewException(Throwable thrwbl) {
        super(thrwbl);
    }

    public ViewException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
