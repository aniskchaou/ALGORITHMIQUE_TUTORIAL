package pile;

public class ImplementationPile {

    public static int sommet = 0;

    public static void main(String[] args) {
        // On va voir l’implémentation d’une pile à l’aide d’un tableau
        //InitPile: Initialiser une pile vide (libre)
        //SOM_P: Retourner le sommet d’une pile
        //Empiler: Insérer un élément au sommet d’une pile (Push)
        //Dépiler: Supprimer l’élément de sommet de la pile (Pop)
        //PileVide: Retourner Vrai si la pile est vide, sinon Faux

        //initialisation
        int pile[] = new int[30];
        
        //algorithme
        empiler(pile, 55);
        empiler(pile, 57);
        empiler(pile, 5);
        afficher(pile);
        System.err.println("sommet " + getSommet(pile));
        depiler(pile);
        afficher(pile);
        System.err.println("sommet " + getSommet(pile));
    }

    public void initPile(int sommet) {
        ImplementationPile.sommet = 0;
    }

    public static int getSommet(int pile[]) {
        return pile[sommet];
    }

    public static void empiler(int pile[], int x) {
        if (sommet < pile.length) {
            ImplementationPile.sommet++;
            pile[ImplementationPile.sommet] = x;

        } else {
            System.err.println("empilement impossible ");
        }
    }

    public static void depiler(int pile[]) {
        if (ImplementationPile.sommet != 0) {
            pile[ImplementationPile.sommet] = 0;
            ImplementationPile.sommet--;
        } else {
            System.err.println("dépilement impossible !");
        }
    }

    public static boolean pileVide(int pile[], int sommet) {
        if (sommet == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void afficher(int pile[]) {
        for (int i = pile.length - 1; i > 0; i--) {
            if (pile[i] != 0) {
                System.err.println("" + pile[i]);
            }

        }
    }

}
