package arrays;

public class InverserTableau {

    public static void main(String[] args) {

//Un algorithme qui permet de inverser un tableau:
        
        //initialisation
        int tab[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = 0, j = tab.length - 1, x = 0;
        
        //algorithme
        while (i < j) {
            
            x = tab[j];
            
            tab[j] = tab[i];
            
            tab[i] = x;
            
            i++;
            j--;
        }
        
       
        
        //affichage
        for (int k = 0; k < tab.length; k++) {
            System.err.println("" + tab[k]);
        }
    }
}
