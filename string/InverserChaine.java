package string;

public class InverserChaine {

    static String chaine = "anis";

    public static void main(String[] args) {
        
        //1) convertir chaine en tableau de caractere
        char[] inputStringArray = chaine.toCharArray();
       
        //2) variable pour mettre la chaine 
        String reverseString = "";

        //3) decompteur
        for (int i = inputStringArray.length - 1; i >= 0; i--) {
            reverseString += inputStringArray[i];
        }
        //4) afficher la chiane
        System.err.println("" + reverseString);
        
    }

    
}
