package com.simobkr.interviewquestion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelsAndConsonantsTest {

    @Test
    void countingVowelsAndConsonants() {

        //given
        String input = "simooi";
        //when
        HashMap<Object, Object> objectObjectHashMap = CountVowelsAndConsonants.CountingVowelsAndConsonants(input);
        //then

        HashMap<Object, Object> expected = new HashMap<>();
        expected.put(4,"vowels");
        expected.put(2,"constants");

        Assertions.assertEquals(expected,objectObjectHashMap);
    }
}