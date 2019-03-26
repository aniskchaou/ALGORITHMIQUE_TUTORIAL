
package general;

//Un algorithme qui permet de calculer la moyenne

import java.util.Scanner;

//d’une série des nombres introduit par le clavier se termine par 0:
public class MoyenneNombresFinisZero {
  
    public static void main(String[] args) {
   
  int n=0,s=0,terme=0,moyenne=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        while (n!=0) {
           s=s+n;
           terme=terme+1;
           n=sc.nextInt();
        }
    
        if (terme!=0) {
            moyenne=s/terme;
        }
        System.err.println("la moyenne est :"+moyenne);
    
  
    }
}
