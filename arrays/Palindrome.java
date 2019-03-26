
package arrays;

public class Palindrome {
    
    public static void main(String[] args) {
        
        char[] tab={'a','b','c','a'};
        System.err.println(""+palindrome(tab));
    }
    
    public static boolean  palindrome(char tab[])
    {   
        //initialisation
        int i=0;
        boolean resultat=true;
        
        //algorithme
        for (int j = 0; j < tab.length; j++) {
            if (tab[j]!=tab[tab.length+-j]) {
                resultat=false;
                j=tab.length+1;
            }
        }
       return resultat; 
    }
 
}
