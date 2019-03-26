
package general;

import java.util.Scanner;


public class SommeNombresFinisZero {
    public static void main(String[] args) {
        
   //initialisation
    int s=0,n=0;
    //lire n
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    
    //tant que n ne se termine pas par 0
        while (n!=0) { 
            //calculer la somme
            s=s+n;
            //reenter de n
            n=sc.nextInt();
        }
    //afficher s    
        System.err.println("La somme est:"+s);
    }
}
