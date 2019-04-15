/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

public class RemoveVowels {

    public void removeVowels(String input){
        StringBuffer result = new StringBuffer();
        char[] chars = input.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            char chr = chars[i];
            if(!isVowel(chr))
                result.append(chr);
        }
        System.out.println("Updated String: " + result);
    }

    public boolean isVowel(char chr){
        String vowels="AEIOUaeiou";
        if(vowels.contains(chr+""))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        RemoveVowels r = new RemoveVowels();
        String input = "algorithms @ tutorial horizon";
        System.out.println("Input String: " +  input);
        r.removeVowels(input);
    }
}
