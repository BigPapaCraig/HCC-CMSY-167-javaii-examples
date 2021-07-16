package edu.howardcc.javaii.examples.generics.generic;

/**
 * Demonstrate using the BoxUnwrapper class
 */
public class BoxUnwrapperDemo {

    public static void main(String[] args) {

        integerBoxDemo();
        numberBoxDemo();
        mixedBoxDemo();

    }

    private static void integerBoxDemo() {
        // Put an Integer into an Integer box
        Box<Integer> integerBox = new Box<>();
        integerBox.set(5);

        // Unwrap the Box<Integer> with a BoxUnwrapper<Integer>
        BoxUnwrapper<Integer> integerBoxUnwrapper = new BoxUnwrapper<>();
        Integer integer =  integerBoxUnwrapper.unwrap(integerBox);
        System.out.printf("Unwrapped an Integer: %d\n", integer);

    }

    private static void numberBoxDemo() {
        // Put a Number into a Number box
        Box<Number> numberBox = new Box<>();
        numberBox.set(5);

        // Unwrap the Box<Number> with a BoxUnwrapper<Number>
        BoxUnwrapper<Number> numberBoxUnwrapper = new BoxUnwrapper<>();
        Number number =  numberBoxUnwrapper.unwrap(numberBox);
        System.out.printf("Unwrapped a Number: %s\n", number);
    }

    private static void mixedBoxDemo() {
        // Put an Integer into an Integer box
        Box<Integer> integerBox = new Box<>();
        integerBox.set(5);

        // Unwrap the Box<Integer> with a BoxUnwrapper<Number>
        // DOES NOT COMPILE!
//        BoxUnwrapper<Number> numberBoxUnwrapper = new BoxUnwrapper<>();
//        Number number =  numberBoxUnwrapper.unwrap(integerBox);
//        System.out.printf("Unwrapped a Number: %s\n", number);
    }


}
