package com.Leetcode75;


//https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/1703128623/?envType=study-plan-v2&envId=leetcode-75
public class ReverseVowelOfString {
    public String reverseVowels(String s) {
        if(s.isEmpty() || s.length() ==1) return s;

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                list.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        int index = list.size()-1;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)== 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                sb.append(list.get(index));
                index--;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
