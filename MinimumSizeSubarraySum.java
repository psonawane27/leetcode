/*
Space complexity: O(1)
Time Complexity: O(N)
*/
import java.util.*;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int i = 0, j = 0, sum = 0, min = nums.length+1;
        while (j < nums.length) {
            while (sum < s && j < nums.length) 
                sum += nums[j++];
            if(sum>=s){
                while (sum >= s && i < j) 
                    sum -= nums[i++];
                min = Math.min(min, j - i + 1);
            }
        }
        return min == nums.length+1 ? 0 : min;
    }
}