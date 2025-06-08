package com.simobkr.interviewquestion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateWordTest {



    @Test
    void findDuplicateWord_true() {
        //given
        String input = "Simo by SIMO Moha Moha Moha";
        //when
        Set<String> duplicateWord = DuplicateWord.findDuplicateWord(input);
        //then
        Assertions.assertEquals(Set.of("simo","moha"),duplicateWord);
    }


    @Test
    void findDuplicateWord_false() {
        //given
        String input = "Simo by MO";
        //when
        Set<String> duplicateWord = DuplicateWord.findDuplicateWord(input);
        //then
        Assertions.assertEquals(Set.of("simo","moha"),duplicateWord);
    }

    @Test
    void phraseToList() {
        //given
        String input = "Simo by SIMO";
        //when
        List<String> strings = DuplicateWord.phraseToList(input);
        //then
        Assertions.assertEquals(3,strings.size());
    }
}