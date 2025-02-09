// leetcode 238 
import java.util.*;
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]res = new int[n];
        Arrays.fill(res,1); // initally we are initalising all the values in the array as 1.
        int prefix=1;
        int postfix=1;
        for(int i=0;i<n;i++){
            res[i]=prefix;
            prefix=nums[i]*prefix;
        }
        for(int i=n-1;i>=0;i--){
            res[i]=res[i]*postfix;
            postfix=postfix*nums[i];
        }
        return res;

    }
}