
//https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;
        for (int currentNum : nums) {
            if (currentNum <= num1) {
                num1 = currentNum;
            }
            else if (currentNum <= num2) {
                num2 = currentNum;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
