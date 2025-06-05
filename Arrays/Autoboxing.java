

import java.util.ArrayList;
import java.util.Scanner;

//record Customer(String name, ArrayList<Double> transactions){
//    public Customer(String name , double initialDeposit){
//        this(name.toUpperCase(),new ArrayList<Double>(500));
//        transactions.add(initialDeposit);
//    }
//}

public class autoboxing {

    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

//    int [] arr = new int[10];
//    arr={1,2,3,4,5};

    public static void main(String[] args) {
//        int [] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//        for (int j : arr) {
//            System.out.println(j);
//        }
//        System.out.println("**********************");
//        for (int i = arr.length-1; i>=0; i--) {
//            System.out.println(arr[i]);
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in fibonacci series");
        int n = scanner.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.println(fib(i)+" ");
//        String s = scanner.nextLine();
//        StringBuilder s1 = new StringBuilder(s);
//        s1.reverse();
//        if(s.equals(s1.toString())){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("NO");
        }
    }


}
