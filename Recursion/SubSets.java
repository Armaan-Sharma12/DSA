

import java.util.ArrayList;

public class SubSets {
    public static void main(String[] args) {
        System.out.println(subsequence2("","abc"));

    }

    static void subsequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsequence(p+ch,up.substring(1));
        subsequence(p,up.substring(1));
    }
    static ArrayList<String> subsequence1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsequence1(p +ch, up.substring(1));
        ArrayList<String> right = subsequence1(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    static ArrayList<String> subsequence2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsequence2(p +ch, up.substring(1));
        ArrayList<String> right = subsequence2(p,up.substring(1));
        ArrayList<String> ascii = subsequence2(p+(ch+0),up.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
