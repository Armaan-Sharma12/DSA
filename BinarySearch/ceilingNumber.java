public class ceilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println("Ceiling number is : ");
        System.out.println(orderBinarySearchCeiling(arr,target));
    }
    public static int orderBinarySearchCeiling(int[] arr, int target) {
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
        return arr[low];
    }
}
