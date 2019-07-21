/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.traitement;

/**
 *
 * @author user
 */
public class MaximumSubArrays {
   public int maxProduct(int[] nums) {
    int[] max = new int[nums.length];
    int[] min = new int[nums.length];
 
    max[0] = min[0] = nums[0];
    int result = nums[0];
 
    for(int i=1; i<nums.length; i++){
        if(nums[i]>0){
            max[i]=Math.max(nums[i], max[i-1]*nums[i]);
            min[i]=Math.min(nums[i], min[i-1]*nums[i]);
        }else{
            max[i]=Math.max(nums[i], min[i-1]*nums[i]);
            min[i]=Math.min(nums[i], max[i-1]*nums[i]);
        }
 
        result = Math.max(result, max[i]);
    }
 
    return result;
}
   
   public int maxSubArray(int[] nums) {
    int result = nums[0];
    int[] sum =  new int[nums.length];
    sum[0] = nums[0];
 
    for(int i=1; i<nums.length; i++){
        sum[i] = Math.max(nums[i], sum[i-1] + nums[i]);
        result = Math.max(result, sum[i]);
    }
 
    return result;
}

}
