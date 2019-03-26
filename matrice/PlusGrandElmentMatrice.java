
package matrice;


public class PlusGrandElmentMatrice {
    
    public static void main(String[] args) {
        
        //initialisation
        int matrice[][]=new int[4][4];
        int max=0;
        
        //algorithme
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrice[i][j]>max) {
                    max=matrice[i][j];
                }
            }
        }
        
        //affichage
        System.err.println("max: "+max);
    }
  
}
