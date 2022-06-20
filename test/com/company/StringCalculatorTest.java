package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {
    @Test
    void multiTest() {
        Assertions.assertAll(
                () -> assertEquals(0, StringCalculator.Add(null)),
                () -> assertEquals(0, StringCalculator.Add("")),
                () -> assertEquals(0, StringCalculator.Add("s/3i2")),
                () -> assertEquals(9, StringCalculator.Add("9")),
                () -> assertEquals(3, StringCalculator.Add("1,2")),
                () -> assertEquals(18, StringCalculator.Add("6,2,3,7"))
        );
    }
}

