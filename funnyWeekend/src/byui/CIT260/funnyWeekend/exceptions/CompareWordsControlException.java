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
public class CompareWordsControlException extends Exception{

    public CompareWordsControlException() {
    }

    public CompareWordsControlException(String string) {
        super(string);
    }

    public CompareWordsControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public CompareWordsControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public CompareWordsControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

   
    
}
