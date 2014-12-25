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
