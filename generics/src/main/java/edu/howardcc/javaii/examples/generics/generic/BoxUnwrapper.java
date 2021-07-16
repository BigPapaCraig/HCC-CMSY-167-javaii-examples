package edu.howardcc.javaii.examples.generics.generic;

/**
 * Unwraps objects inside of a {@link Box}
 */
public class BoxUnwrapper<T> {

    /**
     * Returns the object contained in a @{@link Box}
     */
    public T unwrap(Box<T> box) {
        return box.get();
    }

}
