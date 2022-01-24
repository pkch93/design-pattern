package edu.pkch.prototype;

import java.util.Objects;

public class Prototype implements Cloneable {
    private int number;
    private String str;

    public Prototype(int number, String str) {
        this.number = number;
        this.str = str;
    }

    public int getNumber() {
        return number;
    }

    public String getStr() {
        return str;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prototype prototype = (Prototype) o;
        return number == prototype.number && Objects.equals(str, prototype.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, str);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
