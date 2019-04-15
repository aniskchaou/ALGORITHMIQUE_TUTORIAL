
package arrays;

import java.util.Arrays;

public class CloseToZero {

    public static void main(String[] args) {

        int[] data = {2,3,-2};
        int curr = 0;
        int near = data[0]; 
        Arrays.sort(data);     
        // find the element nearest to zero
        for ( int i=0; i < data.length; i++ ){
            
             curr = data[i] * data[i]; 
            
            
             if ( curr <= (near * near) )  { 
                near = data[i];
             } 
            
            
        }
        
        System.out.println( near );
    }
    
}
