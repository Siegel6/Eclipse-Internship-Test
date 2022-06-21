package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void addNull() throws Exception {
        assertEquals(0, StringCalculator.Add(null));
    }

    @Test
    void addNoNumbers() throws Exception {
        assertEquals(0, StringCalculator.Add(""));
    }

    @Test
    void addWrongCharacters() throws Exception {
        assertEquals(5, StringCalculator.Add("s/3i2"));
    }

    @Test
    void addOneNumber() throws Exception {
        assertEquals(9, StringCalculator.Add("9"));
    }

    @Test
    void addTwoNumbers() throws Exception {
        assertEquals(3, StringCalculator.Add("1,2"));
    }

    @Test
    void addMoreNumbers() throws Exception {
        assertEquals(18, StringCalculator.Add("6,2,3,7"));
    }

    @Test
    void addMoreNumbersNewLine() throws Exception {
        assertEquals(18, StringCalculator.Add("6\n2,\n3\n7"));

    }

    @Test
    void addMoreNumbers2() throws Exception {
        assertEquals(92, StringCalculator.Add("61,\n21,3,sa7"));
    }

    @Test
    void addNegativeNumber() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
                ()-> {StringCalculator.Add("-61,\n21,3,sa7");},"negatives not allowed[-61]");
        Assertions.assertEquals("negatives not allowed[-61]",thrown.getMessage());
    }
}