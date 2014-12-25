
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lst = null;
        ListNode tmp = null;
        int val1 = 0;
        int val2 = 0;
        int index = 1;
        while(l1 != null || l2 != null){
        	if (null != l1){
        		val1 += l1.val * index;
        		l1 = l1.next;
        	}
        	if(null != l2){
        		val2 += l2.val * index;
        		l2 = l2.next;
        	}
        	index *= 10;
        }
        int val = val1 + val2;
        if (val == 0){
        	return new ListNode(0);
        }
        while(val!=0){
        	if (lst != null){
        		lst.next = new ListNode(val%10);
        		lst = lst.next;
        	}
        	else{
        		lst = new ListNode(val%10);
        		tmp = lst;
        	}
        	val /= 10;
        }
        return tmp;
    }
}
