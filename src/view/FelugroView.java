package view;

import javax.swing.JOptionPane;

public class FelugroView {
    
    
    public int bekeres() {
        String v = JOptionPane.showInputDialog("Melyikben van a kincs? (1,2,3):");
        
        return Integer.parseInt(v) -1;
        
    }
    
    public void megjelenit(String txt){
        JOptionPane.showMessageDialog(null, txt);
        //System.out.print(txt);
    }
}
