package Controller;

import model.JatekModel;
import view.ConsoleView;

public class ConsoleController {
    private  JatekModel model;
    private ConsoleView view;

    public ConsoleController(JatekModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
        
        this.view.megjelenit(this.model.kezdes());
        this.model.setValasztott(this.view.bekeres());
        this.view.megjelenit(this.model.ellenorzes());
        
        this.view.bezar();
    }
    
    
}
