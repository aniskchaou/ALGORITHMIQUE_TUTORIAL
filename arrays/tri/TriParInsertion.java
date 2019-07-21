package arrays.tri;

public class TriParInsertion {
//Un algorithme qui permet de tri un tableau (Tri par insertion):
//Idée: le principe du tri par insertion consiste à insérer le i_eme élément dans la suite 
//des (i – 1) éléments déja triés.

    public static void main(String[] args) {
        //initilisation
        int tab[] = {2, 4, 1, 2, 9, 3};
        //algorithme
        triParInsertion(tab, 6);
        
        //affichage
        for (int i = 0; i < tab.length; i++) {
            System.err.println("" + tab[i]);
        }
    }

    public static void triParInsertion(int[] tab, int tailleLogique) {
        int cpt;
        int element;

        for (int i = 1; i < tailleLogique; i++) {
            element = tab[i];
            cpt = i - 1;
            while (cpt >= 0 && tab[cpt] > element) {
                tab[cpt + 1] = tab[cpt];
                cpt--;
            }
            tab[cpt + 1] = element;
        }
    }

}
