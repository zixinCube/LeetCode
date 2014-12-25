https://oj.leetcode.com/problems/add-two-numbers/

You are given two linked lists representing two non-negative numbers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

Tags LinkedList Math

【分析】
按示例，342 + 465 = 807，然后将807按逆序再存储在链表中

最终没有通过，有case无法通过，超出int范围
Input:	{9}, {1,9,9,9,9,9,9,9,9,9}
Output:	{8,0,4,5,6,0,0,1,4,1}
Expected:	{0,0,0,0,0,0,0,0,0,0,1}

【code】
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
