package com.StringBuffer;
import java.util.Random;
public class GenerateRandomString {
    public static void generate(int l){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<l;i++){
            sb.append((char)(r.nextInt(26)+'a'));
        }
        System.out.println(sb.toString());
    }
}
