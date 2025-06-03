public class infiniteArray {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        int target = 47;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int target) {
        int low = 0;
        int high = low + 6;
        while (low <= high) {
            if (arr[high] < target) {
                low = high + 1;
                high = low +6;
            } else {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }
}
