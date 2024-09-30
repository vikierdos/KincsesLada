package view;

import java.util.Scanner;

public class ConsoleView extends CUIView{
    private static final Scanner sc = new Scanner(System.in);

    @Override
    public int bekeres() {
        megjelenit("Melyikben van a kincs? (1,2,3):");
        return sc.nextInt() - 1;       
    }
    
    @Override
    public void megjelenit(String txt){
        System.out.print(txt);
    }
    
    public void bezar(){
        sc.close();
    }
}
