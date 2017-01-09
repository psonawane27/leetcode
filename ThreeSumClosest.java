/*
Space complexity: O(1)
Time Complexity: O(N^2)
*/
import java.util.*;

public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
        int diff=Integer.MAX_VALUE, closeSum=0;
        int sum;
        Arrays.sort(nums);
        for(int k=0; k<nums.length-2; k++) {
            for(int i=k+1, j=nums.length-1; i<j; ) {
                sum = nums[k] + nums[i] + nums[j];
                if (sum == target)
                    return sum;
                else if (sum > target) {
                    if (sum-target < diff) {
                        diff = sum-target;
                        closeSum = sum;
                    }
                    j--;
                } else {
                    if(target-sum < diff) {
                        diff = target-sum;
                        closeSum = sum;
                    }
                    i++;
                }
            }
        }
        return closeSum;
    }
}