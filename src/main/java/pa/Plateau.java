package pa;

import java.util.ArrayList;

public class Plateau {

    public Case depart;

    public Case impot;

    public Case allerenprison;

    public Case prison;

    public Case luxe;



    private ArrayList<CaseConstructible> caseSansProprietaire = new ArrayList<>();

    public Plateau(){
        ArrayList<Case> plateau = new ArrayList<>();
        creerLesCases(plateau);
        creerLesCasesSuivantes(plateau);
        genererListeCaseSansProprietaire(plateau);
    }

    private void creerLesCases(ArrayList<Case> plateau ){
        depart = new CaseSpeciale("Depart");
        plateau.add(depart);
        plateau.add( new CaseConstructible("Boulevard de Bellevile", 20, 2,"v"));
        plateau.add( new CaseConstructible("Rue Lecourbe", 40, 4, "v"));
        plateau.add( new CaseConstructible("Rue Vaugirard", 60, 6,"b"));
        plateau.add( new CaseConstructible("Rue pa.De Courcelles", 60, 6,"b"));
        plateau.add( new CaseConstructible("Avenue de la Republique", 80, 8,"b"));
        plateau.add( new CaseConstructible("Avenue de Neuilly", 100, 10,"p"));
        plateau.add( new CaseConstructible("Boulevard de la Villette", 100, 10,"p"));
        plateau.add( new CaseConstructible("Rue de Paradis", 120, 12,"p"));
        plateau.add( new CaseConstructible("Avenue Mozart", 140, 14,"o"));
        plateau.add( new CaseConstructible("Boulevard St Michel", 140, 14,"o"));
        plateau.add( new CaseConstructible("Place Pigalle", 160, 16,"o"));
        plateau.add( new CaseConstructible("Boulevard Malesherbes", 180, 18,"r"));
        plateau.add( new CaseConstructible("Avenue Matignon", 180, 18,"r"));
        plateau.add( new CaseConstructible("Avenue Henri Martin", 200, 20,"r"));
        plateau.add( new CaseConstructible("Place de la Bourse", 220, 22,"j"));
        plateau.add( new CaseConstructible("Faubourg St Honore", 220, 20,"j"));
        plateau.add( new CaseConstructible("Rue de la Fayette", 240, 24,"j"));
        plateau.add( new CaseConstructible("Avenue Foch", 260, 26,"w"));
        plateau.add( new CaseConstructible("Avenue de Breteuil", 260, 26,"w"));
        plateau.add( new CaseConstructible("Boulevard des Capucines", 280, 28,"w"));
        plateau.add( new CaseConstructible("Avenue des Champs Elysees", 300, 30,"g"));
        plateau.add( new CaseConstructible("Rue de la paix",350,35,"g"));
        impot = new CaseSpeciale("Impot sur le Revenu");
        plateau.add( impot );
        luxe = new CaseSpeciale("Taxe de Luxe");
        plateau.add( luxe );
        prison = new CaseSpeciale("Prison");
        plateau.add( prison );
        allerenprison = new CaseSpeciale("Aller en Prison");
        plateau.add( allerenprison );
        plateau.add( new CaseConstructible("Gare pa.De Lyon",120,25,"gare"));
        plateau.add( new CaseConstructible("Gare Mont-Parnasse",120,25,"gare"));
        plateau.add( new CaseConstructible("Gare Du Nord",120,25,"gare"));
        plateau.add( new CaseConstructible("Gare Saint-Lazar",120,25,"gare"));
    }

    private void creerLesCasesSuivantes(ArrayList<Case> plateau){
        for (int i = 0; i < plateau.size()-1; i++) {
            plateau.get(i).setSuivante(plateau.get(i+1));
        }
        plateau.get(plateau.size()-1).setSuivante(plateau.get(0));
}

    private void genererListeCaseSansProprietaire(ArrayList<Case> plateau){
        for (Case c: plateau) {
            if (c.getClass() == CaseConstructible.class){
                caseSansProprietaire.add((CaseConstructible) c);
            }
        }
    }

    public ArrayList<CaseConstructible> getCaseAchetable(){
          return caseSansProprietaire;
    }
}
