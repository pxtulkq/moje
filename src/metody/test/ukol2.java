package src.metody.test;

public class ukol2 {

    static int parkovani(int misto, int dny){
        int cenazaden = 80;
        int cena = (misto * cenazaden) * dny;

        if (misto > 10){
            double a = cena * 0.90;
        }

        return cena;
    }

    public static void main(String[] args) {

        System.out.println(parkovani(13,3));

    }
}