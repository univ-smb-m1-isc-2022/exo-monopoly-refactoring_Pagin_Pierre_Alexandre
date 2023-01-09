package pa;

public class Gobelet {

    private final De[] des;

    public Gobelet(int nbDe){
        des = new De[nbDe];
        for (int i = 0; i < nbDe; i++) {
            des[i] = new De();
        }
    }

    public int lancerLesDes(){
        int[] valeurlancer = new int[des.length];
        for (int i = 0; i < des.length; i++) {
            des[i].lancer();
            valeurlancer[i] = des[i].getValeur();
        }
        int sum = 0;
        for (int e: valeurlancer) {
            sum += e;
        }
        return sum;
    }

    public boolean aFaitUnDouble(){
        int val = des[0].getValeur();
        for (De e : des) {
            if (e.getValeur() != val){
                return false;
            }
        }
        return true;
    }



}
