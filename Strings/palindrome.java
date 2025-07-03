package com.Strings;

public class palindrome {
    public static boolean palindromeString(String ch) {
        if (ch == null || ch.length() <= 1) {
            return true; // Empty string or single character string is a palindrome
        }

        StringBuilder sb = new StringBuilder(ch);
        sb.reverse();
        return sb.toString().equals(ch);
    }

    public static void main(String[] args) {
        String a = "010";
        System.out.println(palindromeString(a));
    }
}
