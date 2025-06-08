package com.simobkr.interviewquestion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeVerifyTest {



    @Test
    void checkPalindrome_true() {

        //given
        String input = "abc123321cba";
        //when
        var result = PalindromeVerify.checkPalindrome(input);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void checkPalindrome_false() {
        //given
        String input = "bc123321cba";
        //when
        var result = PalindromeVerify.checkPalindrome(input);
        //then
        Assertions.assertFalse(result);
    }

    @Test
    void simplifyPalindrome() {
        //given
        String input = "abc,1233 21cba";
        //when
        String result = PalindromeVerify.simplifyPalindrome(input);
        //then
        Assertions.assertEquals("abc123321cba",result);
    }
}