/*
http://www.cs.utexas.edu/~moore/best-ideas/mjrty/index.html
Space complexity: O(1)
Time Complexity: O(N)
*/
import java.util.*;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int major=nums[0], count = 1;
        for(int i=1; i<nums.length;i++){
            if(count==0){
                count++;
                major=nums[i];
            }else if(major==nums[i]){
                count++;
            }else count--;
            
        }
        return major;
    }
}