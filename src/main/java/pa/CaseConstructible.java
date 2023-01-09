package pa;

public class CaseConstructible extends Case {
    private final int coutAchat;
    private final int loyer;
    private final Quartier quartier;
    private Joueur proprietaire;

    public CaseConstructible(String name, int coutAchat, int loyer, Quartier q) {
        super(name);
        this.coutAchat = coutAchat;
        this.loyer = loyer;
        this.quartier = q;
        this.proprietaire = null;
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

    public int nombreProprieteDeLaCouleur(){
        return quartier.getSizeQuartier();
    }

    public Joueur getProprietaire() {
        return proprietaire;
    }

    public boolean hasProprietaire(){
        return proprietaire != null;
    }

    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }
}
