package com.Leetcode75;
//https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&envId=leetcode-75
public class MaximumAverageSubArray {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return 0.00000;
        }
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        double maxSum = currentSum;
        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum / k;

    }
}
