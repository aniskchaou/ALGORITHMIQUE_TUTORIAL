package arrays.traitement;

public class Fusionner2Tableau {
    // Un algorithme qui permet de fusioner deux tableaux dans un tableau:

    public static void main(String[] args) {

        //initialisation
        int tab1[] = {1, 2, 3};
        int tab2[] = {4, 5, 6};
        int k = 0;
        int tab3[] = new int[tab1.length + tab2.length];

        //for i=0
        for (int i = 0; i < tab1.length; i++) {
            tab3[i] = tab1[i];
        }
        //for j=tab.length
        for (int j = tab1.length; j < tab1.length + tab2.length; j++) {
            tab3[j] = tab2[k];
            k++;
        }

        //affichage
        for (int i = 0; i < tab3.length; i++) {
            System.err.println("" + tab3[i]);

        }
    }

}
