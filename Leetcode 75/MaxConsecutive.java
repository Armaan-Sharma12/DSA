//https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int current = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i]==1){
                current++;
            } else{
                count = Math.max(count,current);
                current = 0;
            }
        }
        count = Math.max(count,current);
        return count;
    }

    //https://leetcode.com/problems/max-consecutive-ones-iii/?envType=study-plan-v2&envId=leetcode-75
    public int longestOnes(int[] nums, int k) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                k--;
            }

            if (k < 0) {
                if (nums[left] == 0) {
                    k++;
                }
                left++;
            }
        }
        return nums.length - left;
    }
}
