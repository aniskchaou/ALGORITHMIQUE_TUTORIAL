
package math;

import java.util.Scanner;


public class PGCD {
    

 
public static void main(String[ ] args) { 
       int p,q; 
        Scanner sc=new Scanner(System.in);
        
       System.out.print("Entrez le premier nombre : "); 
       p =sc.nextInt();
       System.out.print("Entrez le deuxième nombre : "); 
       q =sc.nextInt();
      if (p*q!=0) 
        System.out.println("Le pgcd de "+p+" et de "+q+" est "+pgcd(p,q)); 
      else System.out.println("Le pgcd n'existe pas lorsque l'un des deux nombres est nul !"); 
  }

 
static int pgcd (int a , int b) { 
    int r=0;
    if ( b>a) { 
        int t = a; 
            a = b; 
            b = t; 
     } 
    do { 
         r = a % b; 
            a = b; 
            b = r; 
    } while(r !=0); 
   return a ; 
  }
} 
      

