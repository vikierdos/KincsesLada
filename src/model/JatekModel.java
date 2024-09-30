package model;

public class JatekModel {
    
    
    
    private LadaModel[] ladak;
    private int valasztott;
    

    public JatekModel() {
        
        valasztott = -1;
        
        ladak = new LadaModel[3];
        
        ladak[0] = new LadaModel("arany", "Én rejtem a kincset");
        ladak[1] = new LadaModel("ezüst", "Nem én rejtem a kincset", true);
        ladak[2] = new LadaModel("bronz", "Az arany hazudik");
    }

    public String kezdes() {
        String s = "Hol a kincs? Csak az egyik láda felirata igaz!\n";
        int i = 1;
        for(LadaModel lada: ladak){
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            s += i + ". " + a + "láda: " + f + "\n";
            i++;
        }
        return s;
    }

    
    
    public String ellenorzes(){
        String s = "Gratulálok, eltaláltad!";
        
        s = ladak[valasztott].isKincs() ? s : "Sajnos nem talált";
        
        return s + "\n";
    }

    public int getValasztott() {
        return valasztott;
    }

    public void setValasztott(int valasztott) {
        this.valasztott = valasztott;
    }
    
}
