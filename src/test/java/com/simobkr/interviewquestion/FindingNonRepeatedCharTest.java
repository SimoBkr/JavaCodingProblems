package com.simobkr.interviewquestion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindingNonRepeatedCharTest {

    @Test
    void findingNonRepeatedChar() {

        //given
        var str = "siimmoaa";
        //then
        Character result = FindingNonRepeatedChar.firstRepeatedCharacter(str);
        //when
        Assertions.assertEquals('i',result);
    }
}