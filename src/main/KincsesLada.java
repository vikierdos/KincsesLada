package main;

import Controller.ConsoleController;
import Controller.FelugroController;
import model.JatekModel;
import view.ConsoleView;
import view.FelugroView;

public class KincsesLada {

    public static void main(String[] args) {
        
        /*JatekModel model = new JatekModel();
        ConsoleView view = new ConsoleView();
        
        new ConsoleController(model, view);*/
        
        JatekModel model = new JatekModel();
        FelugroView view = new FelugroView();
        
        new FelugroController(model, view);
        
    }
    
}
