package com.simobkr.interviewquestion;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {


    public static String removeDuplicateCharacters(String str) {

        Set<Character> check = new HashSet<>();

        StringBuilder result = new StringBuilder();

        char[] charArray = str.toCharArray();

        for (Character oneChar : charArray){

            if (check.add(oneChar)) {
                result.append(oneChar);
            }
        }
        return result.toString();

    }
}
