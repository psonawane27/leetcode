/*
Space complexity: O(1)
Time Complexity: O(m+n)
*/
import java.util.*;

public class IntersectionLinkedList {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //boundary check
        if(headA == null || headB == null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
        	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;    
        }
        
        return a;
    }
    /*
    Space complexity: O(1)
    Time Complexity: O(m+n)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode temp=headA, slow, fast;
        while(temp.next != null) temp=temp.next;
        temp.next=headB;
        slow=headA;
        fast=headA;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=headA;
                while(slow != fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                temp.next=null;
                return slow;
            }
        }
        temp.next=null;
        return null;
    }*/
}
/*
Sol3:
1. Get the length of the two lists.
2. Align them to the same start point.
3. Move them together until finding the intersection point, or the end null
*/