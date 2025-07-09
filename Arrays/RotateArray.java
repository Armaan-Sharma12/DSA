

public class RotateArray {
    public static void main(String[] args) {

    }
        public void rotate(int[] arr, int d) {
            int n = arr.length;
            if (arr == null || n == 0 || d < 0) return;
            int steps = d % (n);
            if (steps == 0) return;
            int[] ans = new int[n];

            for (int i = 0; i < steps; i++) {
                ans[i] = arr[n - d + i];
            }
            for (int i = 0; i < n - steps; i++) {
                ans[d + i] = arr[i];
            }
            for (int i = 0; i < n; i++) {
                arr[i] = ans[i];
            }
        }

}
