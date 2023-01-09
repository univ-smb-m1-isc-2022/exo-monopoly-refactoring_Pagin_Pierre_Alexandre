package pa;

public class CaseConstructible extends Case {
    private final int coutAchat;
    private final int loyer;
    private final Quartier quartier;

    public CaseConstructible(String name, int coutAchat, int loyer, Quartier q) {
        super(name);
        this.coutAchat = coutAchat;
        this.loyer = loyer;
        this.quartier = q;
        q.addCaseQuartier(this);
    }

    public int getCoutAchat() {
        return coutAchat;
    }

    public int getLoyer() {
        return loyer;
    }

    public String getCouleur(){
        return quartier.getCouleur() ;
    }

    public int nombreProprieteDeLaCouleur(String couleur){
        return quartier.nombreProprieteDeLaCouleur(couleur);
    }


}
