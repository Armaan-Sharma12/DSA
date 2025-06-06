

import java.util.ArrayList;

public class LinearSearchDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,5,2,7,2,10,2,34,52,23};
        int target = 2;
        System.out.println(linearSearch2(arr,target,0));
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> linearSearch(int[] arr, int start, int target) {
        if(start==arr.length-1 && arr[start]!=target) return list;
        if(arr[start] == target) list.add(start);
        linearSearch(arr,start+1,target);
        return list;
    }
    public static ArrayList<Integer> linearSearch2(int[] arr, int target, int start) {
        ArrayList<Integer> answer = new ArrayList<>();
        if(start== arr.length) return answer;
        if(arr[start] == target) answer.add(start);
        ArrayList<Integer> AnsBelowCalls = linearSearch2(arr,target,start+1);
        answer.addAll(AnsBelowCalls);
        return answer;
    }
}
