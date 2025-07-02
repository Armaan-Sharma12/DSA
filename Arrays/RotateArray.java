package com.Arraysss;

public class RotateArray {
    public static void main(String[] args) {

    }
    public static void rotateArr(int[] arr, int d) {
        // add your code here
        if (arr == null || arr.length == 0 || d < 0) {
            return;
        }
        int[] ans = new int[arr.length];
        int steps = d % (arr.length);
        int end = arr.length-1;
        int p =arr.length -1;
        for(int i = steps-1;i>=0;i-- ){
            ans[p] = arr[i];
            p--;
        }
        for(int i = 0; i<arr.length-steps;i++){
            ans[i] = arr[steps];
            steps++;
        }
        for(int i = 0 ; i<=end;i++){
            arr[i] = ans[i];
        }
    }
}
