
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class countMatches {
    public static void main(String[] args) {
//        List<List<String>> itemList = new ArrayList<>();
//        itemList.add(Arrays.asList("phone", "blue", "pixel"));
//        itemList.add(Arrays.asList("computer", "silver", "lenovo"));
//        itemList.add(Arrays.asList("phone", "gold", "iphone"));
//
//        String ruleKey = "color";
//        String ruleValue = "blue";
//
//        System.out.println(countMatch(itemList,ruleKey,ruleValue));

        int [] gain = new int[]{44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        largestAltitude(gain);
    }
    public static int countMatch(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int ruleIndex;
        if (Objects.equals(ruleKey, "type")) {
            ruleIndex = 0;
        } else if (Objects.equals(ruleKey, "color")) {
            ruleIndex = 1;
        } else if (Objects.equals(ruleKey, "name")) {
            ruleIndex = 2;
        } else {
            ruleIndex = 0;
        }
        for (List<String> item : items) { // Iterate through each item list
            if (Objects.equals(item.get(ruleIndex), ruleValue)) {
                count++;
            }
        }

        return count;
    }

    public static void largestAltitude(int[] gain) {
        int[] result = new int[gain.length+1];
        result[0]=0;

        for(int i =1; i<gain.length;i++){
            result[i] = gain[i-1]+result[i-1];
        }

        int maxElement=0;
        for(int max : result){
            maxElement = Math.max(maxElement,max);
        }
        System.out.println(maxElement);
        System.out.println(Arrays.toString(result));
    }
}
