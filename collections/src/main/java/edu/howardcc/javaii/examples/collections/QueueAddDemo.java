package edu.howardcc.javaii.examples.collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Demonstrate overfilling a queue with add (which throws an exception)
 */
public class QueueAddDemo {

    public static void main(String[] args) {
        // Create a queue with limited capacity
        Queue<String> queue = new ArrayBlockingQueue<>(3);

        try {
            System.out.printf("add one: %s\n", queue.add("one"));
            System.out.printf("add two: %s\n", queue.add("two"));
            System.out.printf("add three: %s\n", queue.add("three"));

            // Throws an IllegalStateException
            System.out.printf("add four: %s\n", queue.add("four"));
        }
        catch (IllegalStateException e) {
            System.out.printf("Caught Exception: %s\n", e);
            System.out.printf("queue: %s\n", queue);
        }

    }

}
