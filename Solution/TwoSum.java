public class Solution {
// 暴力循环
public int[] twoSum(int[] numbers, int target) {
    	int[] index = {-1,-1};
    	for (int i=0; i<numbers.length; i++){
    		for (int j=i+1; j<numbers.length; j++){
    			if (numbers[i]+numbers[j] == target){
    				index[0] = i+1;
    				index[1] = j+1;
    				break;
    			}
    		}
    	}
        return index;
    }

// 先排序，后首尾同时进行
public int[] twoSum2(int[] numbers, int target) {
    	int[] index = {-1,-1};
    	int[] numbersBak = numbers.clone();
    	Arrays.sort(numbersBak);
    	int left = 0;
    	int right = numbersBak.length-1;
    	boolean hasFind = false;
    	while(left < right && !hasFind){
    		if (numbersBak[left] + numbersBak[right] == target){
    			hasFind = true;
    			break;
    		}
    		else if(numbersBak[left] + numbersBak[right] > target){
    			right--;
    		}
    		else
	    		left++;
    	}
    	
    	if (hasFind){
    		int pos = 0;
    		for(int i=0; i<numbers.length; i++){
    			if(numbersBak[left] == numbers[i] || numbersBak[right] == numbers[i]){
    				index[pos++] = i+1;
    			}
    			if(pos>1)
    				break;
    		}
    	}
    	return index;
    }
    
    // 使用HashMap
  }
