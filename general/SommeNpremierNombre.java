
package general;

import java.util.Scanner;

//Un algorithme qui permet de calculer la somme de n premiers nombre
public class SommeNpremierNombre {
    public static void main(String[] args) {
        
        //initialisation
        int s=0,n=0; 
        
        //lire n
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
 
       //calculer la somme
        for (int i = 0; i < n; i++) {
           s+=s+i; 
        }
        //afficher le resultat
        System.out.println("Le somme est: "+s);

    }
}
