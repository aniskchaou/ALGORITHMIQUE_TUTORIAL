/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.premier;

/**
 *
 * @author user
 */
public class Premier {

    public static void main(String[] args) {
        System.err.println(""+isPremier(7));
    }
    public static boolean isPremier(int n) {
        boolean isPremier = true;
        if (n < 0) {
            isPremier = false;
        } else if (n != 0 && n != 1) {
            for (int i = 2; i <= n / 2; i++) {
                if (n != i && n % i == 0) {
                    isPremier = false;
                    break;
                }
            }
        }
        return isPremier;
    }
}
