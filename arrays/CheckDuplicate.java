package arrays;

public class CheckDuplicate {

    public static void hasDuplicates2ForLoops(int[] arrA) {

        //commencer a partir de zero
        for (int i = 0; i < arrA.length; i++) {
           
            //decalage 
            for (int j = i + 1; j < arrA.length; j++) {

                //si les deux elments consecutives sont égaux
                if (arrA[i] == arrA[j]) {
                    System.out.println("Array has duplicates : " + arrA[i]);
                }
            }
        }

    }

    public static void main(String[] args) {
        int a[] = {1, 6, 5, 2, 3, 3, 2};
        hasDuplicates2ForLoops(a);
    }
}
