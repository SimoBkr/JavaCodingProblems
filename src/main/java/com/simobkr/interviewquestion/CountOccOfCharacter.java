package com.simobkr.interviewquestion;

public class CountOccOfCharacter {


    public static Integer countOccOfCharacter(String str ,char character) {
        int occurrence = 0;
        
        for (char cr : str.toCharArray()) {
            if (cr == character) {
                occurrence++;
            }
        }
        return occurrence;
        
    }
}
