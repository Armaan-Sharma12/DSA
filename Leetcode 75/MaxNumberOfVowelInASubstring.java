package com.Leetcode75;
//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=study-plan-v2&envId=leetcode-75
public class MaxNumberOfVowelInASubstring {
    public int maxVowels(String s, int k) {
        if(s.length()==0) return 0;
        int count = 0;
        for(int i = 0 ; i<k;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        int max = count;
        for(int i = k;i<s.length();i++){
            if(s.charAt(i-k)=='a'||s.charAt(i-k)=='e'||s.charAt(i-k)=='i'||s.charAt(i-k)=='o'||s.charAt(i-k)=='u'){
                count--;
            }
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
            if(count>max) max = count;
        }
        return max;
    }
}
