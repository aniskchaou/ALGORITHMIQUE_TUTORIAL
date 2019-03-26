
package string;


public class InverserPhrase {
    
    
    public static void main(String[] args) {
        
        //la chaine en entrée
        String chaine = "I love Java Programming"; 

       //découper la phrase en un ensemmble de mots
        String[] temp = chaine.split(" ");
       
        //resultat
        String result = ""; 
  
       //parcourir la tableau
        for (int i = 0; i < temp.length; i++) { 
            //si temp est le dernier mot
            if (i == temp.length - 1) 
                //concatiner avec result 
                result = temp[i] + result; 
            else
                //mettre un espace avant 
                result = " " + temp[i] + result; 
        } 
        
        System.out.println(result);
        
    }
  
  
}
