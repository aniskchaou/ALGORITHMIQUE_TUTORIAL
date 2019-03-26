package string;

import java.util.Scanner;

public class TransformerMinusculeMajuscule {

    public static void main(String[] args) {
        
        //initialisation
        char maj[] = {'A', 'B', 'Z'};
        char min[] = {'a', 'b', 'z'};

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        //algorithme
        char[] char_array = input.toCharArray();
        for (int k = 0; k < char_array.length; k++) {
            for (int l = 0; l < min.length; l++) {
                if (min[l] == char_array[k]) {
                    char_array[k] = maj[l];
                }
            }
        }
        
        //affichage
        String res = new String(char_array);
        System.out.println("resultat : " + res);

    }
}
