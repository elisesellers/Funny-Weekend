/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.funnyWeekend.model;

import java.io.Serializable;

/**
 *
 * @author Yura
 */
public enum Activity implements Serializable{
    
    activityFM("View11","Friday Morning Words"),
    activityFA("View12","Friday Afternoon Words"),
    activityFE("View13","Friday Evening Math"),
    activityStM("View21","Saturday Morning Words"),
    activityStA("View22","Saturday Afternoon Words"),
    activityStE("View23","Saturday Evening Math"),
    activitySuM("View31","Sunday Morning Words"),
    activitySuA("View32","Sunday Afternoon Words"),
    activitySuE("View33","Sunday Evening Math");
    
    // class variables
    private final String activity;
    private final String description;

    private Activity(String activity, String description) {
        this.activity = activity;
        this.description = description;
    }
    
    public String getActivity() {
        return activity;
    }

    public String getDescription() {
        return description;
    }
}
