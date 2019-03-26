package general;

public class DivisionEntiere {

    public static void main(String[] args) {
       //initialisation
        int a = 12, b = 6, i = 0;
       //tant que a>b
        while (a > b) {
            a = a - b;
            i++;
        }
        //afficher 
        System.out.print("La division entière est " + i);
    }
}
