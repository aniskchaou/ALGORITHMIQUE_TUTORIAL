
package string;

import java.util.Scanner;

public class MotMiroir {
    public static void main(String[] args) {
       
       //initialisation
        int j=0;
         Scanner sc=new Scanner(System.in);
        char[] input=sc.next().toCharArray();        
        char[] res=null;
        
        //algorithme
        for (int k = input.length; k ==01; k--) {
            res[j]=input[k];
            j++;
        }
        
        //affichage
        String s=new String(res);
        System.err.println(""+s);
       
    }
}
