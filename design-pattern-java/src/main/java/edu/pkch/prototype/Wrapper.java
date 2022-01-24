package edu.pkch.prototype;

public class Wrapper implements Cloneable {
    private final Prototype prototype;

    public Wrapper(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype getPrototype() {
        return prototype;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
