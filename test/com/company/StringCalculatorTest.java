package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    @Test
    void addNull(){
        Assertions.assertEquals(0,StringCalculator.Add(null));
    }
    @Test
    void addNoNumbers(){
        Assertions.assertEquals(0,StringCalculator.Add(""));
    }
    @Test
    void addWrongCharacters(){
        Assertions.assertEquals(0,StringCalculator.Add("s/3i2"));
    }
    @Test
    void addOneNumber() {Assertions.assertEquals(9,StringCalculator.Add("9"));}
    @Test
    void addTwoNumbers() {
        Assertions.assertEquals(3,StringCalculator.Add("1,2"));
    }
    @Test
    void addMoreNumbers(){
        Assertions.assertEquals(8,StringCalculator.Add("6,2,3,7"));
    }
}