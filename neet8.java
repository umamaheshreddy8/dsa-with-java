import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0; // checking the edge / base case
        }
        HashSet<Integer> numset= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            numset.add(nums[i]);
        }
        int longestsubsequence=1;
        for(int num:numset){
            if(numset.contains(num-1)){
                continue;
            }
            else{
                int currentnum = num;
                int currentSubsequence=1;
                while(numset.contains(currentnum+1)){
                    currentnum++;
                    currentSubsequence++;
                }
                longestsubsequence=Math.max(longestsubsequence,currentSubsequence);
            }
        }
        return longestsubsequence;
    }
}
