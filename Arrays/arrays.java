

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] returnedArray = readInteger();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }
    public static int [] readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by a commas");
        String input = scanner.nextLine();
        String[] numbers = input.split(",");
        int[] array = new int[numbers.length];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(numbers[i].trim());
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

}
