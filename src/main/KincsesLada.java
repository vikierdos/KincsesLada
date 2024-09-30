package main;

import Controller.ConsoleController;
import model.JatekModel;
import view.ConsoleView;

public class KincsesLada {

    public static void main(String[] args) {
        
        JatekModel model = new JatekModel();
        ConsoleView view = new ConsoleView();
        
        new ConsoleController(model, view);
    }
    
}
