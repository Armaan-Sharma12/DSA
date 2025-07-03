

public class FindTheOriginal1 {
    public static int possibleStringCount(String word) {
        int count = 1;
        StringBuilder sb = new StringBuilder(word);
        for (int i = 1; i <sb.length()  ; i++) {
            if(sb.charAt(i-1) == sb.charAt(i)){
                count++;
                sb.deleteCharAt(i-1);
                i--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abbcccc";
        System.out.println(possibleStringCount(str));
    }
}
