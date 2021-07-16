package edu.howardcc.javaii.examples.generics.generic;

/**
 * Demonstrates using a generic Box
 */
public class BoxDemo {

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        integerBox.set(5);

        // No casting required when using generic version
        Integer integer = integerBox.get();
        System.out.printf("Integer from box: %d\n", integer);

        // Does not compile
        // Double dbl = integerBox.get();
        // System.out.printf("Double from box: %f\n", dbl);


    }

}
