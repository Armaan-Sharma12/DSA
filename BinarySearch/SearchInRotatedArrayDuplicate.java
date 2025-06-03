
public class searchInRotatedArrayDuplicate {
    public static void main(String[] args) {

    }
    int findPivotWithDuplicates(int[] arr){
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
            //Duplicates so we will remove start and end , if start, end and mid is equal
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                if(arr[end]<arr[end-1]){
                    return end;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return -1;
    }
}
