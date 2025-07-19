
//https://leetcode.com/problems/container-with-most-water/submissions/1703299003/?envType=study-plan-v2&envId=leetcode-75
public class ConatinerWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
            int n = height.length;
            int left = 0;
            int right = n-1;
            int maxw = Integer.MIN_VALUE;

            while(left<right){
                maxw = Math.max(maxw,Math.min(height[left],height[right])*(right-left));
                if(height[left]<height[right]) left++;
                else right--;
            }
            return maxw;
        }
    }
}
