public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(binarySearch1D(arr,11));
    }

    public static int binarySearch1D(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}

