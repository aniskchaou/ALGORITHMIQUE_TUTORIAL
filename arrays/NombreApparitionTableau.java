
package arrays;


public class NombreApparitionTableau {
 
    public static void main(String[] args) {
        //initialisation
        int occurance=0;
        int  input=4;
        int tab[]={1,2,3,4,4,4};
        
        //algorithme
        for (int i = 0; i < tab.length; i++) {
            if(tab[i]==input)
            {
                occurance++;
            }  
        }
        
        //affichage
        System.err.println("nombre apparition "+occurance);
    }
    
    
}
