package com.simobkr.interviewquestion;

public class ReverseWords {


    public static String reversingWords(String str) {

        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String wordReversed = new StringBuilder(word).reverse().toString();
            result.append(wordReversed);
            result.append(" ");
        }
        String substring = result.toString().substring(0, result.toString().length() - 1);
        return  substring;
    }


    // optimal solution

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(new StringBuilder(words[i]).reverse());
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
