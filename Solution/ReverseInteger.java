public class Solution {
    public int reverse(int x) {
    	int flag = 1;
    	flag = x==0? 0 : (x>0 ? 1 : -1);
    	x *= flag;
    	int res = 0;
    	if (x==0 || x==Integer.MIN_VALUE){
    		return 0;
    	}
    	while(x!=0){
    		if (res >= Integer.MAX_VALUE/10+1){
    			flag = 0;
    			break;
    		}
    		res = res*10 + x%10;
    		x /= 10;
    	}
        return res*flag;
    }

//下面例子未考虑翻转溢出，溢出后intValue()报异常
/*
public int reverse(int x) {
    	int flag = 1;
    	flag = x>0 ? 1 : -1;
    	x *= flag;
        return flag*Integer.valueOf(new StringBuffer(Integer.toString(x)).reverse().toString()).intValue();
    }
    */
}
