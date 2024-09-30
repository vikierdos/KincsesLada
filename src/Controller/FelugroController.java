
package Controller;

import model.JatekModel;
import view.FelugroView;

public class FelugroController {
    private  JatekModel model;
    private FelugroView view;

    public FelugroController(JatekModel model, FelugroView view) {
        this.model = model;
        this.view = view;
        
        this.view.megjelenit(this.model.kezdes());
        this.model.setValasztott(this.view.bekeres());
        this.view.megjelenit(this.model.ellenorzes());
    }
}
