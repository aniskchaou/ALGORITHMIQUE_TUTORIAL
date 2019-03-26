
package string;


public class InclusionChaine {
    public static void main(String[] args) {
        //  Un algorithme qui permet de dire si une chaine de caractère est inclue dans l’autre au non

        String chaine1="ani";
        String chaine2="ani"; 

        int pos1=chaine1.indexOf(chaine2);
        int pos2=chaine2.indexOf(chaine1);

        if (pos1!=0 && pos2!=0) {
            System.err.println("il ya une inclusion");
        }else
        {
          System.err.println("il ya  pas une inclusion");  
        }

    }
}
