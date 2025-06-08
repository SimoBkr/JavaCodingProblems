package com.simobkr.interviewquestion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindCharacterMostAppearancesTest {

    @Test
    void findCharacterMostAppearances() {

        //given
        String input = "Wooooooooooordddss";
        //when
        Character result = FindCharacterMostAppearances.findCharacterMostAppearances(input);
        //then
        Assertions.assertEquals('o',result);
    }
}