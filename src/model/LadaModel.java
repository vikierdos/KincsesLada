package model;

public class LadaModel {
    private String anyag;
    private String felirat;
    private boolean kincs;

    public LadaModel(String anyag, String felirat, boolean kincs) {
        this.anyag = anyag;
        this.felirat = felirat;
        this.kincs = kincs;
    }

    public LadaModel(String anyag, String felirat) {
        this(anyag, felirat, false);
    }

    public String getAnyag() {
        return anyag;
    }

    public String getFelirat() {
        return felirat;
    }

    public boolean isKincs() {
        return kincs;
    }
    
    public void kincsetElhelyez(){
        kincs = true;
    }
    
    public void kincsetKivesz(){
        kincs = false;
    }
    
    
}
