package com.simobkr.interviewquestion;

public class PalindromeVerify {


    public static boolean checkPalindrome(String str) {
        String simplifiedInput = simplifyPalindrome(str);
        var reverseInput = new StringBuilder(simplifiedInput).reverse().toString();
        return simplifiedInput.equals(reverseInput);
    }


    public static String simplifyPalindrome(String str) {
       return str.toLowerCase().replaceAll("[^a-z0-9]", "");
    }
}
