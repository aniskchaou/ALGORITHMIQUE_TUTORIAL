package arrays.tri;

public class TriRapide {

//Un algorithme qui permet de tri un tableau (Tri à bulle (Tri par probagassion)):
//Idée: parcoure le tableau et compare les couples d’élément successive, lorsque deux éléments 
//successives ne sont pas dans l’ordre ils sont échangés, aprés chaque parcoure du tableau, 
//l’algorithme recommance l’opération. Lorsque aucune échange n’ailleux pendant le parcoure, 
// cela signifier le tableau est bien trié et on arret l’algorithme.
    public static void main(String[] args) {
        
        //initialisation
        int i = 0;
        int x = 0;
        int[] tab = {3, 5, 6, 9, 3, 1, 5, 2};
       
        //pour continuer l'itération
        boolean changement = true;

        //algorithme
        while (changement) {

            changement = false;

            for (i = 0; i < tab.length - 1; i++) {

                if (tab[i] > tab[i + 1]) {
                    
                    x = tab[i];
                    
                    tab[i] = tab[i + 1];
                    
                    tab[i + 1] = x;
                    
                    changement = true;
                }

            }
        }

        //affichage
        for (int j = 0; j < tab.length; j++) {
            System.err.println("" + tab[j]);
        }
    }

}
