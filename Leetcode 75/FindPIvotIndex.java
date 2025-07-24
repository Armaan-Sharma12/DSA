
//https://leetcode.com/problems/find-pivot-index/?envType=study-plan-v2&envId=leetcode-75
public class FindPIvotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        for(int i=0;i<nums.length;i++){
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}
