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
public class UglyNumber {
    public static boolean isUgly(int num) {
    if(num==0) return false;
    if(num==1) return true;
 
    if(num%2==0){
        num=num/2;
        return isUgly(num);
    }
 
    if(num%3==0){
        num=num/3;
        return isUgly(num);
    }
 
    if(num%5==0){
        num=num/5;
        return isUgly(num);
    }
 
    return false;
}
    
    public static void main(String[] args) {
        System.err.println(""+isUgly(30));
    }
}
