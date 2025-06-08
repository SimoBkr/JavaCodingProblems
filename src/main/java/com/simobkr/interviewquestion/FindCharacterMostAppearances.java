package com.simobkr.interviewquestion;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FindCharacterMostAppearances {

    public static Character findCharacterMostAppearances(String str) {

        HashMap<Integer,Character> appearanceChar = new HashMap<>();

        Integer appearanceCount =0;

        char[] letters = str.toCharArray();

        for (char letter:letters) {

            for (int i = letters.length - 1 ; i >= 0 ; i--) {
                if (letter == letters[i]) {
                    appearanceCount++;
                }
            }
            appearanceChar.put(appearanceCount,letter);
            appearanceCount  = 0;
        }

        Character maxKey = appearanceChar.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getKey))
                .get()
                .getValue();

        return maxKey;
    }
}
