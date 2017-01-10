/*
Space complexity: O(k)
Time Complexity: O(N)
*/
import java.util.*;

public class ContainsDuplicateIII {
	/*public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(t==0){
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
        for(int j=1; j<=k; j++){
            for(int i=0; i<nums.length-j; i++){
                if(Math.abs((long)(nums[i]-nums[i+j])) <= t){
                    return true;
                }
            }
        }
        return false;
    }*/
	
	private long getID(long i, long w) {
		return i < 0 ? (i + 1) / w - 1 : i / w;
	}

	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (t < 0) return false;
		Map<Long, Long> d = new HashMap<>();
		long w = (long)t + 1;
		for (int i = 0; i < nums.length; ++i) {
			long m = getID(nums[i], w);
			if (d.containsKey(m))
				return true;
			if (d.containsKey(m - 1) && Math.abs(nums[i] - d.get(m - 1)) < w)
				return true;
			if (d.containsKey(m + 1) && Math.abs(nums[i] - d.get(m + 1)) < w)
				return true;
			d.put(m, (long)nums[i]);
			if (i >= k) d.remove(getID(nums[i - k], w));
		}
		return false;
	}
}