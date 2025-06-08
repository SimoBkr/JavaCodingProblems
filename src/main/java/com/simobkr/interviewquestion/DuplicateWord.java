package com.simobkr.interviewquestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWord {


    public static Set<String> findDuplicateWord(String str) {

        List<String> inputs = phraseToList(str);

        Set<String> seen = new HashSet<>();
        Set<String> duplicated = new HashSet<>();

        for (String item : inputs) {
            if (!seen.add(item)){
                duplicated.add(item);
            }
        }

        return duplicated;
    }


    public static List<String> phraseToList(String str) {
        String[] words = str.toLowerCase().split(" ");
        ArrayList<String> results = new ArrayList<>();
        for (int i =0 ; i< words.length;i++) {
            results.add(words[i]);
        }
        return results;
    }
}
