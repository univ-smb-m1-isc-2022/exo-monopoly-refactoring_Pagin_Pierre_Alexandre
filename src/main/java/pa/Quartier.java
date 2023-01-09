package pa;

import java.util.ArrayList;

public class Quartier {

    private final String couleur;

    private ArrayList<CaseConstructible> caseQuartier;

    public Quartier(String couleur) {
        this.couleur = couleur;
        this.caseQuartier = new ArrayList<>();
    }

    public String getCouleur() {
        return couleur;
    }

    public ArrayList<CaseConstructible> getCaseQuartier() {
        return caseQuartier;
    }

    public void addCaseQuartier(CaseConstructible c){
        caseQuartier.add(c);
    }

    public int getSizeQuartier(){
        return caseQuartier.size();
    }

}
