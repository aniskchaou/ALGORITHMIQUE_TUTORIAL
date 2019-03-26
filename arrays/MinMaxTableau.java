package arrays;

public class MinMaxTableau {

    public static void main(String[] args) {

        //initialisation
        int tab[] = {2, 6, 8, 8, 9, 10};
        int min = 0, max = 0;

        //algorithme
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            } else if (tab[i] > max) {
                max = tab[i];
            }
        }

        //affichage 
        System.err.println("min " + min);
        System.err.println("max " + max);
    }

}
