package model;

import java.util.Scanner;

public class Jatek {
    
    private static final Scanner sc = new Scanner(System.in);
    
    private Lada[] ladak;
    private int valasztas;
    

    public Jatek() {
        
        valasztas = -1;
        
        ladak = new Lada[3];
        
        ladak[0] = new Lada("arany", "Én rejtem a kincset");
        ladak[1] = new Lada("ezüst", "Nem én rejtem a kincset", true);
        ladak[2] = new Lada("bronz", "Az arany hazudik");
        
        
        megjelenit(kezdes());
        bekeres();
        megjelenit(ellenorzes());
        vege();
    }

    public String kezdes() {
        String s = "Hol a kincs? Csak az egyik láda felirata igaz!\n";
        int i = 1;
        for(Lada lada: ladak){
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            s += i + ". " + a + "láda: " + f + "\n";
            i++;
        }
        return s;
    }

    private void bekeres() {
        megjelenit("Melyikben van a kincs? (1,2,3):");
        valasztas = sc.nextInt() - 1;
        
        /* FONTOS a bekérésnél meg is kell nyitni
        sc.close(); Kilépésnél GC (Garbage Collector) felszabadít
        */
        
    }
    
    private String ellenorzes(){
        String s = "Gratulálok, eltaláltad!";
        
        s = ladak[valasztas].isKincs() ? s : "Sajnos nem talált";
        
        /*  Mellékhatás, az ellenőrzés be is zárja a scannert, de erről nem értesít
        sc.close();
        */
        return s + "\n";
    }
    
    private void megjelenit(String txt){
        System.out.print(txt);
    }
    
    private void vege(){
        sc.close();
    }
    
}
