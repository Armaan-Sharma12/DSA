import java.util.Arrays;
public class numberOfRotationOfArray {
    public static void main(String[] args) {
        int[] arr= {2,3,6,12,15,18};
        System.out.println(Arrays.toString(arr));
        int pivot = findPivot(arr);
//        if(pivot == arr.length-1){
//            System.out.println("Number of rotations: 0");
//        }
        int rotations = pivot +1;
        System.out.println("Number of rotations: "+ rotations);

    }
    static int findPivot(int[] arr){
        int start =0;
        int end =arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            //4 cases
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
