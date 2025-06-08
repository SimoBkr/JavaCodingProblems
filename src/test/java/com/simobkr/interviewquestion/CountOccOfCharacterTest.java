package com.simobkr.interviewquestion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOccOfCharacterTest {

    @Test
    void countOccOfCharacter_true() {
        //given
        String input = "siiMo";
        //when
        Integer result = CountOccOfCharacter.countOccOfCharacter(input, 'i');
        //then
        Assertions.assertEquals(2,result);
    }
}