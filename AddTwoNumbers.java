/*
Space complexity: O(n)
Time Complexity: max[O(m), O(n)]
*/
import java.util.*;

public class AddTwoNumbers {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode(0);
        ListNode result = resultHead;
        int sum=0, carry=0;
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + carry;
            carry = sum/10;
            sum = sum%10;
            result.next = new ListNode(sum);
            l1 = l1.next;
            l2 = l2.next;
            result = result.next;
        }
        while(l1 != null){
            sum = l1.val + carry;
            carry = sum/10;
            sum = sum%10;
            result.next = new ListNode(sum);
            l1 = l1.next;
            result = result.next;
        }
        while(l2 != null){
            sum = l2.val + carry;
            carry = sum/10;
            sum = sum%10;
            result.next = new ListNode(sum);
            l2 = l2.next;
            result = result.next;
        }
        if(carry != 0)
            result.next = new ListNode(carry);
        return resultHead.next;
    }
}