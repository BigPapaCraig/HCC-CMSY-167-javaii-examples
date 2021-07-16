package edu.howardcc.javaii.examples.generics.simple;

/**
 * A simple non-generic container class
 *
 * Based on example from https://docs.oracle.com/javase/tutorial/java/generics/types.html
 */
public class SimpleBox {

    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }


}