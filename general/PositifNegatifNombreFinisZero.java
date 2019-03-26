
package general;

import java.util.Scanner;


public class PositifNegatifNombreFinisZero {
    public static void main(String[] args) {
  
       int n=0,positif=0,negatif=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        while (n!=0) {            
            if (n>0) {
                positif++;
            } else {
                negatif++;
            }
             n=sc.nextInt();

        }
        
        System.err.println("positif : "+positif);
        System.err.println("nagatif :"+negatif);
    }
}
