/*
Space complexity: O(1)
Time Complexity: O(n)
*/
import java.util.*;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
     if(head==null || head.next==null)return false;
     for(ListNode slow=head, fast=head.next; fast!=slow; slow=slow.next, fast=fast.next.next)
         if(fast.next==null || fast.next.next==null) return false;
     return true;
    }
}