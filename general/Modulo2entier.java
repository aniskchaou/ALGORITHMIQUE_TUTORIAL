package general;

//Un algorithme qui permet de calculer le modulo de deux entièrs
public class Modulo2entier {

    public static void main(String[] args) {
       // initialisation
        int a = 12, b = 6;
        //tant que a>b
        while (a > b) {
            a = a - b;
        }
        System.out.print("le modulo est " + a);

    }
}
