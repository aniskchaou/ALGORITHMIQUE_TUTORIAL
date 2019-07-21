/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.premier;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PrimeCounter {
    
    public static void main(String[] args) {
        System.err.println(""+countPrimes(6));
    }
    
    public static int countPrimes(int n) {
    n = n-1;
 
    ArrayList<Integer> primes = new ArrayList<Integer>();
 
    if(n<=1) 
        return 0;
    if(n==2)
        return 1;
    if(n==3)
        return 2;
 
    primes.add(2);
    primes.add(3);
 
    for(int i=4; i<=n; i++){
        boolean isPrime = true;
        for(int p: primes){
            int m = i%p;
            if(m==0){
                isPrime = false;
                break;
            }
        }
 
        if(isPrime){
            primes.add(i);
        }
    }
 
    return primes.size();
}
}
