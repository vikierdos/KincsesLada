package view;

import java.util.Scanner;

public class ConsoleView {
    private static final Scanner sc = new Scanner(System.in);

    public int bekeres() {
        megjelenit("Melyikben van a kincs? (1,2,3):");
        return sc.nextInt() - 1;       
    }
    
    public void megjelenit(String txt){
        System.out.print(txt);
    }
    
    public void bezar(){
        sc.close();
    }
}
