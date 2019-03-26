
package arrays;


public class NombreApparitionTableau {
 
    public static void main(String[] args) {
        //initialisation
        int nbr=0,x=4;
        int tab[]={1,2,3,4,4,4};
        
        //algorithme
        for (int i = 0; i < tab.length; i++) {
            if(tab[i]==x)
            {
                nbr++;
            }  
        }
        
        //affichage
        System.err.println("nombre apparition "+nbr);
    }
    
    
}
