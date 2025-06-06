

public class BinarySearchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2};
        int target = 1;
        System.out.println(bSearch(arr,target,0,arr.length-1));
    }

    static int bSearch(int[] arr, int target, int start, int end) {
        if(start > end) return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid]== target) return mid;
        if(arr[start]<=arr[mid]){
            if(target>= arr[start] && target<= arr[mid]) return bSearch(arr, target, start, mid - 1);
            else return bSearch(arr, target, mid + 1, end);
        }

        if(target>=arr[mid] && target <= arr[end]) return bSearch(arr, target, mid+1, end);
        return bSearch(arr, target, start, mid-1);


    }
}
