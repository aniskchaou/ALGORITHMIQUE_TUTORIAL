
package arrays;


public class PositionElementTableau {
   // Un algorithme qui permet de renvoyer la position d’un élément dans un tableau:
    public static void main(String[] args) {
        
        //initialisation
        int tab[]={1,2,3,4,5,6};
        int x=4,pos=0;
        
        //algorithme
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]==x) {
                pos=i;
            }
        }
        
        //affichage
        System.err.println(""+pos);
    }

}
