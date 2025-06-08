package com.simobkr.interviewquestion;



import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountVowelsAndConsonants {

    private static final Set<Character> allVowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));


    public static HashMap<Object, Object> CountingVowelsAndConsonants(String str){

        String strLowerCase = str.toLowerCase();
        Integer counVowel = 0;
        Integer consonantVowel = 0;
        var results = new HashMap<>();
        for (char c : strLowerCase.toCharArray()) {
            if(allVowels.contains(c)) {
                counVowel++;
            }else if((c >= 'a' && c <= 'z')){
                consonantVowel++;
            }
        }
        results.put(counVowel, "vowels");
        results.put(consonantVowel, "constants");
        return results;
    }

}
