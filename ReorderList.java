/*
Space complexity: O(1)
Time Complexity: O(n)
*/
import java.util.*;

public class ReorderList {
	public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return;
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode otherHalf=slow.next;
        slow.next=null;
        ListNode curr=otherHalf, prev=null, next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        curr=head;
        otherHalf=prev;
        while(otherHalf!=null){
            ListNode currNext=curr.next;
            ListNode otherNext=otherHalf.next;
            
            curr.next=otherHalf;
            otherHalf.next=currNext;
            curr=currNext;
            otherHalf=otherNext;
        }
    }
}