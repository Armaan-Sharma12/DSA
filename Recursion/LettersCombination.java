

import java.util.ArrayList;
import java.util.List;

public class LettersCombination {
    public static void main(String[] args) {
//        pad("","12");
        System.out.println(combo("","12"));
    }
//    public List<String> letterCombinations(String digits) {
//
//    }
    public static List<String> combo(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) -'0';

        List<String> ans = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a'+i);
            ans.addAll(combo(p+ch,up.substring(1)));
        }
        return ans;
    }
    public static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char)('a'+i);
            pad(p+ch,up.substring(1));
        }
    }
}
