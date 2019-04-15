/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

public class CompareStrings {

    public static boolean compare(String x, String y){
        if(x==null || y==null){
            return false;
        }
        //compare lengths
        if(x.length()!=y.length())
            return false;

        //compare all characters
        for (int i = 0; i <x.length() ; i++) {
            if(x.charAt(i)!=y.charAt(i))
                return false;
        }
        //if here, means both strings are equal
        return true;
    }

    public static void main(String[] args) {
        String x = "tutorial";
        String  y = "tutorial";
        System.out.println("String x='" + x + "' and String y='" + y + "' are equal?? -" + compare(x, y));
        x = "tutorial";
        y = "tutorial ";
        System.out.println("String x='" + x + "' and String y='" + y + "' are equal?? -" + compare(x, y));
        x = "tutorial";
        y = " ";
        System.out.println("String x='" + x + "' and String y='" + y + "' are equal?? -" + compare(x, y));
    }
}
