package leetcode.easy;

class Solution0009 {
    
    public boolean isPalindrome(int x) {
        
        int reverseNum = getReverseNum(x);
        if (x == reverseNum){
            return true;
        }
        
        return false;
    }
    
    private int getReverseNum(int i){
        if(i == 0){
            return 0;
        }
        
        int reverseNum = 0;
        int previousNum = 0;
        boolean isNegative = false;
        
        if(i < 0){
            isNegative = true;
            i = i*(-1);
        }
        
        while(i > 0){
            reverseNum = reverseNum*10 + i%10;
            if((reverseNum - i%10)/10 != previousNum){
                return 0;
            }
            
            previousNum = reverseNum;
            i = i/10;
        }
        
        return reverseNum;
    }
    
    public boolean isPalindromeAnotherApproach(int x) {
        String numStr = Integer.toString(x);
        StringBuilder sb = new StringBuilder(numStr);
        if(numStr.equals(sb.reverse().toString())){
            return true;
        }
        
        return false;
    }
}
