package edu.howardcc.javaii.examples.generics.simple;

/**
 * Demonstrates using a non-generic Box
 */
public class SimpleBoxDemo {

    public static void main(String[] args) {

        SimpleBox integerBox = new SimpleBox();
        integerBox.set(5);

        // Casting required when contents is retrieved
        Integer integer = (Integer) integerBox.get();
        System.out.printf("Integer from box: %d\n", integer);

        // Compiles but throws a ClassCastException
        Double dbl = (Double) integerBox.get();
        System.out.printf("Double from box: %f\n", dbl);

    }

}
