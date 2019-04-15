/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

public class ReverseString {

    public String reverse(String input){
        if(input.isEmpty())
            return input;
        //else put the character at the beginning to the end
        //make a recursive call
        return reverse(input.substring(1))+input.charAt(0);
    }

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        String input = "tutorial horizon";
        String reversedString = r.reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }
}
