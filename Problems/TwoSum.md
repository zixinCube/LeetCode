【题目】
https://oj.leetcode.com/problems/two-sum/

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Tags: Array HashMap

Input: numbers={2, 7, 11, 15}, target=9

Output: index1=1, index2=2

【分析】
这道题给出的Tips是Array和Hash Table两个，也就是说和Array相关，需要用到Hash Table技术。
拿到题目，最简单最直接想到的就是暴力循环的方式：

    	for (int i=0; i<numbers.length; i++){
    	
    		for (int j=i+1; j<numbers.length; j++){
    		
    			if (numbers[i]+numbers[j] == target){
    			
    				index[0] = i+1;
    				
    				index[1] = j+1;
    				
    				break;
    				
    			}
    			
    		}
    		
    	}

代码简单，实现简单，很显然，效率很低。提交后即显示运行超时，超时的用例中输入的numbers序列是{2,4,6,……,10200}超长序列。
该方式复杂度是O(n^2),需要降低复杂度。
想到的方法是先排序，然后使用两个指针头尾同时往里检测，如此，排序复杂度O(nlgn),检测O(n)。
由于排序会打乱原序列的顺序，因此排序后的序列序号与原始序号不一致，需要重新匹配序号，匹配序号复杂度O(n),总的复杂度是O(nlgn).
重新提交代码：
 
  再次提交，通过。运行速度处于中间水平，解锁Solution，提供的Solution方案如下：
O(n2) runtime, O(1) space – Brute force:

The brute force approach is simple. Loop through each element x and find if there is another value that equals to target – x. As finding another value requires looping through the rest of array, its runtime complexity is O(n2).
O(n) runtime, O(n) space – Hash table:

We could reduce the runtime complexity of looking up a value to O(1) using a hash map that maps a value to its index.

【Solution & Code】
