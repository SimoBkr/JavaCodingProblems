package com.simobkr.interviewquestion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateCharactersTest {

    @Test
    void removeDuplicateCharacters() {
        //given
        String input = "SSiimo";
        //when
        String result = RemoveDuplicateCharacters.removeDuplicateCharacters(input);
        //then
        Assertions.assertEquals("Simo",result);
    }
}