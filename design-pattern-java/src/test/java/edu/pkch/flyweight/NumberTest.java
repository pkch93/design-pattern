package edu.pkch.flyweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    void isSameNumberTest() {
        // given
        Number number1 = Number.valueOf(1);
        Number number2 = Number.valueOf(1);

        // when & then
        assertSame(number1, number2);
    }

    @Test
    void isNotSameNumberTest() {
        // given
        Number number1 = Number.valueOf(1);
        Number number2 = Number.valueOf(1);

        int updateValue = 2;
        number2.setValue(updateValue);

        // when & then
        assertEquals(number1.getValue(), updateValue);
    }
}