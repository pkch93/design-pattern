package edu.pkch.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class PrototypeTest {

    @Test
    void prototypeClone() throws CloneNotSupportedException {
        // given
        Prototype prototype = new Prototype(1, "str");

        // when
        Prototype actual = (Prototype) prototype.clone();

        // then
        assertTrue(prototype != actual);
        assertTrue(prototype.equals(actual));

        prototype.setNumber(2);
        prototype.setStr("str2");
        Assertions.assertNotEquals(prototype.getNumber(), actual.getNumber());
        Assertions.assertNotEquals(prototype.getStr(), actual.getStr());
    }
}