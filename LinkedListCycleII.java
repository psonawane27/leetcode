/*
Space complexity: O(1)
Time Complexity: O(n)
*/
import java.util.*;

public class LinkedListCycle|| {
	public ListNode detectCycle(ListNode head) {
        ListNode slow=head, fast=head;
        boolean loopExists=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                loopExists=true;
                break;
            }
        }
        if(loopExists==false) return null;
        else {
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
    }
}