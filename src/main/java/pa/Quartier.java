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

    public int nombreProprieteDeLaCouleur(String couleur){
        if (couleur=="v"){
            return 2;}
        else if (couleur=="b"){
            return 3;}
        else if (couleur== "p"){
            return 3;}
        else if (couleur=="o"){
            return 3;}
        else if (couleur=="r"){
            return 3;}
        else if (couleur=="j"){
            return 3;}
        else if (couleur=="w"){
            return 3;}
        else if (couleur=="g"){
            return 2;}
        else return 0;
    }
}
