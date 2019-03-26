package matrice;

public class RemplirMatriceCarree {
    //Un algorithme qui permet de remplir une matrice carrée de n lignes et n colonnes par une 
    //matrice identitée:

    //Remarque: une matrice identité est une matrice carrée de taille n dont les coefficients sont 1
    //sur la diagonale et 0 ailleurs.
    public static void main(String[] args) {
       //initialisation
        int matrice[][] = new int[4][4];
        
        //algorithme
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (true) {
                    matrice[i][j] = 1;
                } else {
                    matrice[i][j] = 0;
                }
            }
        }
    }

}
