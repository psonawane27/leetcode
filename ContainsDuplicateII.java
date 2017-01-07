/*
Space complexity: O(N)
Time Complexity: O(N)
*/
import java.util.*;

public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int j;
        for(int i=0; i<nums.length; i++){
            if(m.containsKey(nums[i])){
                j = m.get(nums[i]);
                if(i-j <= k)
                    return true;
            }
            m.put(nums[i],i);
        }
        return false;
    }
}