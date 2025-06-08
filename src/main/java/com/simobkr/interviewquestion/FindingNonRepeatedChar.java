package com.simobkr.interviewquestion;

import java.util.HashSet;
import java.util.Set;

public class FindingNonRepeatedChar {


    public static Character firstRepeatedCharacter(String str) {

        Set<Character> seen = new HashSet<>();

        Character result = ' ';

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if(!seen.add(c)) {
                result = c;
                break;
            }else {
                seen.add(c);
            }
        }
        return result;
    }

    // solution optimal

    public static Character firstRepeatedCharacterOptimal(String str) {
        Set<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.add(c)) {
                return c;
            }
        }
        return null;
    }
}
