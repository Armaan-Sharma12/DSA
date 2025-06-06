

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,2,9,8,5,21,30,12};
        System.out.println(lS(arr,0,2));
    }
    public static int lS(int[] arr, int start, int target){
        if(start==arr.length-1 && arr[start]!=target) return -1;
        if(arr[start] == target) return start;
        else return  lS(arr,start+1,target);
    }
}
