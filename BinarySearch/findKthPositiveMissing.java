
//https://leetcode.com/problems/kth-missing-positive-number/submissions/1693114122/
import java.util.ArrayList;

public class findKthPositiveMissing {
    public int findKthPositive(int[] arr, int k) {
//        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int i = 1;
        int miss = 0;
        while(miss< k){
            if(start<arr.length && arr[start]==i){
                start++;
            }
            else{
                miss++;
                if(miss==k){
                    return i;
                }
            }
            i++;
        }
        return -1;
    }
}
