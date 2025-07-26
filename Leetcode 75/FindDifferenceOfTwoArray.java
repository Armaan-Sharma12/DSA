

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//https://leetcode.com/problems/find-the-difference-of-two-arrays/?envType=study-plan-v2&envId=leetcode-75
public class FindDifferenceOfTwoArray {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int k : nums1) {
            set1.add(k);
        }
        for (int j : nums2) {
            set2.add(j);
        }
        HashSet<Integer> set = new HashSet<>(set1);
        set1.removeAll(set2);
        List<Integer> list = new ArrayList<>(set1);
        answer.add(list);
        set2.removeAll(set);
        List<Integer> list1 = new ArrayList<>(set2);
        answer.add(list1);

        return answer;
    }
}
