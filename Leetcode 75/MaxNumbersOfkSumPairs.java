
//https://leetcode.com/problems/max-number-of-k-sum-pairs/submissions/1703938884/?envType=study-plan-v2&envId=leetcode-75
import java.util.Arrays;

public class MaxNumbersOfkSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int  n = nums.length;
        int left = 0 ; int right = n-1;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum == k){
                left++;
                right--;
                count++;
            }

            else if(sum>k){

                right--;
            }
            else{
                left++;
            }
        }
        return count;

    }
}
