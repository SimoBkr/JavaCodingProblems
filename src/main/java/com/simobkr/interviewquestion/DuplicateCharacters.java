package com.simobkr.interviewquestion;

import java.util.*;

public class DuplicateCharacters {

    public static List<Character> duplicateCharacters(String words) {

        char[] charArray = words.toCharArray();

        List<Character> result = new ArrayList<>();
        List<Character> duplicatedChar= new ArrayList<>();

        for(int i = 0 ; i <charArray.length ; i++) {
            if(!result.contains(charArray[i])) {
                 result.add(charArray[i]);
            }else {
                 duplicatedChar.add(charArray[i]);
            }
        }
        return duplicatedChar;
    }


    //optimal solution
    public static List<Character> duplicateCharactersOptimalSolution(String words) {

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new LinkedHashSet<>(); // Maintain insertion order

        for (char c : words.toCharArray()) {
            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }
        return new ArrayList<>(duplicates);
    }
}
