package edu.pkch.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

public class Number {
    private static final Map<Integer, Number> CACHE;

    static {
        CACHE = new HashMap<>();
        IntStream.rangeClosed(-128, 127)
                .forEach(i -> CACHE.put(i, new Number(i)));
    }

    private int value;

    private Number(int value) {
        this.value = value;
    }

    public static Number valueOf(int i) {
        Number number = CACHE.get(i);
        return Objects.requireNonNullElseGet(number, () -> new Number(i));
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int i) {
        this.value = i;
    }
}
