package com.simobkr.interviewquestion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    @Test
    void reversingWords_true() {
        //given
        //String input = "olleH morF siraP";
        String input = "test";
        //when
        String result = ReverseWords.reversingWords(input);
        //thenk
        Assertions.assertEquals("tset",result);
    }
}