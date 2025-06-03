public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int target = 8;
        System.out.println(orderBinarySearch(arr,target));
    }

    public static int orderBinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        boolean isAsc = arr[low]<arr[high];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc){
                if (arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else{
                if (arr[mid] < target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}

