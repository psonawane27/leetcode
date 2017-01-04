import java.util.*;

public class ContainsDuplicateIII {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
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
    }
}