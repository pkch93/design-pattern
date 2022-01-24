package edu.pkch.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapperTest {

    @Test
    void wrapperClone() throws CloneNotSupportedException {
        // given
        Prototype prototype = new Prototype(1, "str");
        Wrapper wrapper = new Wrapper(prototype);

        // when
        Wrapper actual = (Wrapper) wrapper.clone();

        // then
        assertSame(prototype, actual.getPrototype()); // prototype의 주소값이 같음

        prototype.setNumber(2);
        assertEquals(prototype.getNumber(), actual.getPrototype().getNumber());
    }
}