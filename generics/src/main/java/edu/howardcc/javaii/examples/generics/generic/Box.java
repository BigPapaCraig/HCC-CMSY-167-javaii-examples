package edu.howardcc.javaii.examples.generics.generic;

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 *
 * Based on example from https://docs.oracle.com/javase/tutorial/java/generics/types.html
 */
public class Box<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}