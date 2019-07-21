/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author user
 */
public class AddDidigits {
    
    public static void main(String[] args) {
        System.err.println(""+addDigits(38));
    }
    
    public static int addDigits(int num) {
    int sum=0;
 
    String s = String.valueOf(num);
    for(int i=0; i<s.length(); i++){
        sum = sum + (s.charAt(i)-'0');
      //  System.err.println(""+(s.charAt(i)-'0'));
    }
 
    if(sum < 10){
        return sum;
    }else{
        return addDigits(sum);
    }
}
}
