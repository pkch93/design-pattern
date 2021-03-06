package edu.pkch.patterns.proxy;

public interface Queue<T> {

    void push(T value);

    T pop();
}
