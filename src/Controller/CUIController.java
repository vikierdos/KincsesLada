package Controller;

import model.JatekModel;
import view.CUIView;

public class CUIController {
    private  JatekModel model;
    private CUIView view;

    public CUIController(JatekModel model, CUIView view) {
        this.model = model;
        this.view = view;
        
        this.view.megjelenit(this.model.kezdes());
        this.model.setValasztott(this.view.bekeres());
        this.view.megjelenit(this.model.ellenorzes());
    }
    
    
}
