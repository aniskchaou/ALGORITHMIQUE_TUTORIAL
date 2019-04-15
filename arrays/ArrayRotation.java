package arrays;

import java.util.Arrays;

//rotation d'un tableau
public class ArrayRotation {

    static void rotate(int [] arr){
        
        System.out.println("Original Array: " + Arrays.toString(arr));
       
        //si le tableau est vide --> sortir de la fonction
        if(arr==null || arr.length==0)
            return ;
        //récuperer le premier element
        int temp = arr[0];
        //decaler les autres éléments 
        for (int i = 1; i <arr.length ; i++) {
            arr[i-1] = arr[i];
        }
        //mettre le premier element a la derniere case
        arr[arr.length-1] = temp;
        
        //afficher le tableau
        System.out.println("Rotated Array: " +  Arrays.toString(arr));
        System.out.println("_______________________________");
    
    }

    
    
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        rotate(arr);
    }
}
