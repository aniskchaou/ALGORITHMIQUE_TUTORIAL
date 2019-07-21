package arrays.traitement;

public class MoyenneTableau {
    //   Une fonction qui permet de renvoyer la moyenne d’un tableau’:

    public static void main(String[] args) {
        
        //initialtion
        int somme = 0;
        int moyenne = 0;
        int[] tab = {1, 4, 6, 6, 3, 9, 3, 0, 3};
        
        //nombre d'elements
        int n = tab.length;
       
        //algorithme
        for (int j = 0; j < n; j++) {
            somme += tab[j];
        }
        //moyenne
        moyenne = somme / n;
        
        //affichage
        System.err.println("moyenne " + moyenne);

    }

}
