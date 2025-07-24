//https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/?envType=study-plan-v2&envId=leetcode-75
public class LongestSubArrayOfOneAfterDeleting {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        boolean hasZero = false;
        for(int num : nums){
            if(num == 0){
                hasZero = true;
                break;
            }
        }
        if (!hasZero) {
            return nums.length -1;
        }

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while(zeroCount>1){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength,right-left);
        }
        return maxLength;
    }
}
