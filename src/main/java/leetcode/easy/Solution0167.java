package leetcode.easy;

public class Solution0167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int pointer1 = 0;
        int pointer2 = numbers.length-1;
        int sum = 0;
        while(pointer1 < pointer2){
            sum = numbers[pointer1] + numbers[pointer2];
            if(sum > target){
                pointer2--;
            }else if(sum < target){
                pointer1++;
            }else{
                result[0] = pointer1+1;
                result[1] = pointer2+1;
                return result;
            }
        }

        return result;
    }
}
