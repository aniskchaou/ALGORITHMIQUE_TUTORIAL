package file;

public class ImplementationFile {

    public static int tete = 0;
    public static int queue = 0;

    public static void main(String[] args) {
//On va voir l’implémentation d’une file par flot
//InitFile: Initialiser une file vide (libre)
//Enfiler: Insérer un élément à la queue d’une file
//Défiler: Supprimer l’élément de la tete une file
//FilePlien: Retourner Vrai si la file est plienne, sinon Faux
        
       //initialisation
       int file[] = new int[30];
       
       //algorithme
        enfiler(file, 33);
        enfiler(file, 22);
        enfiler(file, 11);
        afficher(file);
        defiler(file, 22);
        
       //affichage
        afficher(file);

    }

    public static void afficher(int file[]) {
        for (int i = file.length - 1; i > -1; i--) {
            if (file[i] != 0) {
                System.err.println("" + file[i]);
            }

        }
    }

    public void initFile() {
        tete = queue--;
    }

    public static void enfiler(int file[], int x) {
        if (fileplein(file)) {
            System.err.println("enfilement impossible");
        } else {
            file[queue] = x;
            queue = ((queue + 1) % file.length);
        }
    }

    public static void defiler(int file[], int x) {

        x = file[tete];
        tete = (tete + 1) % file.length;
    }

    public static boolean fileplein(int file[]) {
        int fileplein = ((queue + 1) % file.length);
        if (fileplein == tete) {
            return true;
        } else {
            return false;
        }
    }

}
