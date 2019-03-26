
package string;


public class SupprimerEspaceBlanche {

    public static void main(String[] args) {
        
        // Un algorithme qui permet de supprimer une unité blanches parmi deux unités.
        char[] s = "sd sf vd fv".toCharArray();
        
        //algorithme
        for (int j = 0; j < s.length; j++) {
            if (s[j] == ' ') {
                s[j] = s[j + 1];
            }
        }
        
        //affichage
        String res = new String(s);
        System.err.println("" + res);
    }
}
