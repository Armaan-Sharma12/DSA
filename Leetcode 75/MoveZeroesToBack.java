
//https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75
public class MoveZeroesToBack {
    public void moveZeroes(int[] arr) {
        if(arr.length<=1 || arr==null) return;
        int nonZero= 0;
        for(int current = 0 ; current<arr.length;current++){
            if(arr[current]!=0){
                int temp = arr[current];
                arr[current] = arr[nonZero];
                arr[nonZero] = temp;
                nonZero++;
            }
        }
    }
}
