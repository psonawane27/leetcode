/*
Space complexity: O(1)
Time Complexity: O(N^3)
*/
import java.util.*;

public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
        int minDiff=Integer.MAX_VALUE, closeSum=0;
        int diff, sum;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    diff = Math.abs(sum - target);
                    if(diff == 0){
                        return sum;
                    }
                    if(diff < minDiff){
                        minDiff = diff;
                        closeSum = sum;
                    }
                }
            }
        }
        return closeSum;
    }
}