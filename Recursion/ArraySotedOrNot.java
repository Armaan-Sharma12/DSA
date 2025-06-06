

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,100,150};
        System.out.println(isSorted(arr,0));

    }
    public static boolean isSorted(int[] arr, int start){
        if(start==arr.length-1) return true;
        if(arr[start]<arr[start+1] && isSorted(arr,start+1)) return true;
        else return false;
    }
}
