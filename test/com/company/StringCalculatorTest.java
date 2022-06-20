package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {
        @Test
    void addNull(){
        assertEquals(0,StringCalculator.Add(null));
    }
    @Test
    void addNoNumbers(){
        assertEquals(0,StringCalculator.Add(""));
    }
    @Test
    void addWrongCharacters(){
        assertEquals(5,StringCalculator.Add("s/3i2"));
    }
    @Test
    void addOneNumber() {
        assertEquals(9,StringCalculator.Add("9"));}
    @Test
    void addTwoNumbers() {
        assertEquals(3,StringCalculator.Add("1,2"));
    }
    @Test
    void addMoreNumbers(){
        assertEquals(18,StringCalculator.Add("6,2,3,7"));
    }
    @Test
    void addMoreNumbersNewLine(){
        assertEquals(18,StringCalculator.Add("6\n2,\n3\n7"));

    }
    @Test
    void addMoreNumbers2(){
        assertEquals(92,StringCalculator.Add("61,\n21,3,sa7"));
    }
}

