
package arrays.tri;

public class TriParSelection {

// Un algorithme qui permet de tri un tableau (Tri par séléction (Tri par extraction)):
//Idée: chercher le plus petit élément de tableau et m’échanger avec l’élément d’indice 1.
//Rechercher le second plus petit élément du tableau et l’échanger avec l’élément d’indice 2.
//Continuer de cette façon jusqu’un ce que le tableau est entierement tri.

    
    public static void main(String[] args) {
        //initialisation 
        int  tab[]={2,4,1,2,9,3};
        //algorithme
         triparselection(tab, 6);
        //affichage
        for (int i = 0; i < tab.length; i++) {
            System.err.println(""+tab[i]);
        }
    }

    public static  void triparselection(int[] t, int sizeOfTheCollection) {

     int i, min, j , x;
     for(i = 0 ; i < sizeOfTheCollection - 1 ; i++)
     {
         min = i;
         for(j = i+1 ; j < sizeOfTheCollection; j++)
              if(t[j] < t[min])
                  min = j;
         if(min != i)
         {
             x = t[i];
             t[i] = t[min];
             t[min] = x;
         }
     }

 }
 

}
