package string;

import java.util.Scanner;

public class NombreConsonnesVoyelles {

    public static void main(String[] args) {
        
        //initialisation
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        char[] voyelle = "aeiouy".toCharArray();
        char[] consonne = "bcdfghjklmnpqrstvxz".toCharArray();
        int cons = 0;
        int voy = 0;
        int blanc = 0;

        //algorithme
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < voyelle.length; j++) {
                if (input[i] == voyelle[j]) {
                    voy++;
                }
            }

            for (int j = 0; j < consonne.length; j++) {
                if (input[i] == consonne[j]) {
                    cons++;
                }
            }

        }
        
        //affichage
        System.err.println("consonne " + cons);
        System.err.println("voyelle " + voy);

    }
}
