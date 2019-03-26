package arrays;

public class RechercheDichotomique {

    //La recherche dichotomique est une manière efficace et rapide de rechercher un élément dans 
    //une structure de données triée (Tableau trié).
    public static void main(String[] args) {

        //initialisation
        int tab[] = {1, 2, 3};
        int acharcher = 3;
        int min = 0;
        int max = 0;
        int pos = (min + max) / 2;
        int position = 0;

        //algorithme
        while (!((max - min) <= 1) || (acharcher == tab[pos])) {
            if (acharcher < tab[pos]) {
                max = pos;
            } else {
                min = pos;
            }
            pos = (min + max) / 2;
        }

        if (acharcher == tab[pos]) {
            position = pos;
        } else {
            position = 0;
        }
        
        //affichage
        if (position == 0) {
            System.err.println(" n'existe pas dans le tableau");
        } else {
            System.err.println(acharcher + " est au rang " + position);
        }
    }

}
