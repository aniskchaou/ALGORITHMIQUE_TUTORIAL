
package general;

import java.util.Scanner;


public class MinMaxNombreFinisZero {
    public static void main(String[] args) {
        
        //initialisation
           int n=0,max=0,min=0 ;
        //lire n
           Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
 
        //si n est different de zero    
            while (n!=0) {    
                
               
                if (n>max) {
                    max=n;
                } else {
                    min=n;
                }
                
              //renter de n  
              n=sc.nextInt();  
        }
  
       //afficher min et max
        System.out.println("Le Max est: "+max);
        System.err.println("Le Min est: "+min);
    

        
    }
        

}
