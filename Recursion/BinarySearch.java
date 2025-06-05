

public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(BS(arr,0,arr.length-1,5));
    }
    public static int BS(int[] arr, int start, int end, int target){
        if(start>=end) return -1;
        int mid = start+(end-start)/2;
        if(arr[mid]==target) return mid;
        if(arr[mid]>target) return BS(arr,start,mid-1,target);
        else return BS(arr,mid+1,end,target);
    }
}
