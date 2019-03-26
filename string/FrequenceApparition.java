package string;

public class FrequenceApparition {

    public static void main(String[] args) {
        // Un algorithme qui permet d’afficher la fréquence d’apparition de s1 dans s:
        
        //initialisation
        String s = "sdfsd sdfsdf sdfsdf sdfs f ";
        String s1 = "sdfsd";
        String s2 = "";
        int fre = 0;
        
        //algorithme
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s1) != 0) {
                fre++;
            }
        }
       
        //affichage
        System.err.println("frequence :  " + fre);

    }
}
