class Solution0007 {
    
    public int reverse(int x) {
        if(x == 0){
            return x;
        }
        if(x > Integer.MAX_VALUE){
            return 0;
        }
        
        int result = 0;
        int previousNum = 0;
        boolean isNegative = false;
        
        if(x < 0){
            isNegative = true;
            x = x*(-1);
        }
        
        while(x > 0){
            result = result*10 + x%10;
            
            //check for overflow
            if((result - x%10)/10 != previousNum){
                return 0;
            }
            
            previousNum = result;
            x = x/10;
        }
        
        
        return isNegative?result*(-1):result;
    }
    
    public int reverseApproach2(int x) {
        if(x == 0){
            return x;
        }
        if(x > Integer.MAX_VALUE){
            return 0;
        }
        
        String numStr = Integer.toString(x);
        String [] numArray = numStr.split("");
        int i = 0;
        int k = numArray.length;
        if(numArray[0].equals("-")){
            i = 1;
        }
        
        while (i < (numStr.length()+1)/2){
            swap(numArray, i, k-1);
            i++;
            k--;
        }
        
        String outputNum = String.join("",numArray);
        try{
            return Integer.valueOf(outputNum);
        }catch(NumberFormatException nfe){
            return 0;
        }
    }
    
    private void swap(String[] numArray, int first, int last){
        String temp = numArray[first];
        numArray[first] = numArray[last];
        numArray[last] = temp;
    }
    
}
