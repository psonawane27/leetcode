/*
Space complexity: O(N)
Time Complexity: O(N)
*/
import java.util.*;

public class ContainsDuplicateI {
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            s.add(nums[i]);
            if(i+1 != s.size())
                return true;
        }
        return false;
    }
}