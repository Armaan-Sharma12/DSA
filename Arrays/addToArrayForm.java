
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class addToArrayForm {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println("Original array is : ");
        System.out.println(Arrays.toString(num));
        System.out.println("Result is: ");
        System.out.println(addToArrayForm1(num,k));
    }
    public static List<Integer> addToArrayForm1(int[] num, int k) {
        List<Integer> list = new LinkedList<Integer>();
        StringBuilder str = new StringBuilder();
        for (int j : num) {
            str.append(j);
        }
        long number = Long.parseLong(str.toString());
        long sum = k + number;
        String numberStr = Long.toString(sum);
        for (char ch : numberStr.toCharArray()) {
            list.add(Character.getNumericValue(ch));
        }
        return list;
    }
}
