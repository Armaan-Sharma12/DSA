

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(diceArray("",4));
    }
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target; i++) {
            dice(p+i,target - i);
        }
    }
    static ArrayList<String> diceArray(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <=6 && i<=target; i++) {
            list.addAll(diceArray(p+i,target - i));
        }
        return list;
    }
}
