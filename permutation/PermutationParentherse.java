/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class PermutationParentherse {
     
    public static void main(String[] args) {
        System.out.println("permutation.Permutation4.main()"+generateParenthesis(3));
    }
    
    public static  List<String> generateParenthesis(int n) {
    ArrayList<String> result = new ArrayList<String>();
    dfs(result, "", n, n);
    return result;
}
/*
left and right represents the remaining number of ( and ) that need to be added. 
When left > right, there are more ")" placed than "(". Such cases are wrong and the method stops. 
*/
public static  void dfs(ArrayList<String> result, String s, int left, int right){
    if(left > right)
        return;
 
    if(left==0&&right==0){
        result.add(s);
        return;
    }
 
    if(left>0){
        dfs(result, s+"(", left-1, right);
    }
 
    if(right>0){
        dfs(result, s+")", left, right-1);
    }
}
}
