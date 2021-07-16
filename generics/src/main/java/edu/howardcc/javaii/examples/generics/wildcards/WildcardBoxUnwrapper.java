package edu.howardcc.javaii.examples.generics.wildcards;

import edu.howardcc.javaii.examples.generics.generic.Box;

/**
 * Unwraps objects inside of a {@link Box}
 */
public class WildcardBoxUnwrapper<T> {

    /**
     * Returns the object contained in a @{@link Box}
     */
    public T unwrap(Box<? extends T> box) {
        return box.get();
    }

}
