package com.simobkr.interviewquestion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DuplicateCharactersTest {

    @Test
    void duplicateCharacters_true() {
        //given
        var input = "Siimmo";
        //when
        List<Character> characters = DuplicateCharacters.duplicateCharacters(input);
        //then
        List<Character> expectedValue = new ArrayList<>();
        expectedValue.add('i');
        expectedValue.add('m');
        Assertions.assertEquals(expectedValue,characters);
    }

    @Test
    void duplicateCharacters_false() {
        //given
        var input = "Simo";
        //when
        List<Character> characters = DuplicateCharacters.duplicateCharacters(input);
        //then
        List<Character> expectedValue = new ArrayList<>();
        expectedValue.add('i');
        expectedValue.add('m');
        Assertions.assertEquals(expectedValue,characters);
    }
}