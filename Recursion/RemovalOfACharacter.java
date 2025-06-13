


public class RemovalOfACharacter {
    public static void main(String[] args) {
        String str = "baccad";
        String target = "a";
        removal("",str );
        System.out.println(removal1(str));

    }
    static void removal(String str,String up){
        if(up.isEmpty()){
            System.out.println(str);
            return;
        }
        char ch = up.charAt(0);
        if(ch =='a') removal(str,up.substring(1));
        else removal(str+ch, up.substring(1));
    }

    static String removal1(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch =='a') return removal1(up.substring(1));
        else  return ch+removal1(up.substring(1));
    }
}
