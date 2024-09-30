package main;

import Controller.CUIController;
import model.JatekModel;
import view.CUIView;
import view.ConsoleView;
import view.FelugroView;

public class KincsesLada {

    public static void main(String[] args) {
        
        /*JatekModel model = new JatekModel();
        ConsoleView view = new ConsoleView();
        
        new ConsoleController(model, view);*/
        
        /*JatekModel model = new JatekModel();
        FelugroView view = new FelugroView();
        
        new FelugroController(model, view);*/
        
        CUIView view;
        JatekModel model = new JatekModel();
        view = new ConsoleView();
        new CUIController(model, view);
        
        view = new FelugroView();
        new CUIController(model, view);
        
    }
    
}
