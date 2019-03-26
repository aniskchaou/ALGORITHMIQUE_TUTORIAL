package autre;

public class ModeCroisement {

    public static void main(String[] args) {
        //Une procédure qui permit de changer un tableau trié en mode croisement à décroisent
        //sans passer par d’autre fonction
        
        //initialisation
        int tab[] = {1, 2, 3, 4, 5};
        int d = 0;
        int f = tab.length - 1;
        int x = 0;
        
        //algorithme
        while (d < f) {
            x = tab[d];
            tab[d] = tab[f];
            tab[f] = x;
            d++;
            f--;
        }
        
        //affichage
        for (int j = 0; j < tab.length; j++) {
            System.err.println("" + tab[j]);
        }
    }

}
