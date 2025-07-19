
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75
import java.util.ArrayList;
import java.util.List;

public class KidWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxi = 0;
        for (int i = 0; i < candies.length; i++) {
            maxi = Math.max(maxi, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            int x = candies[i] + extraCandies;
            if (x >= maxi) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
