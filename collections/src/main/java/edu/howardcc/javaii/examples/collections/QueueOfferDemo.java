package edu.howardcc.javaii.examples.collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Demonstrate overfilling a queue with offer (which does not throw an exception)
 */
public class QueueOfferDemo {

    public static void main(String[] args) {
        // Create a queue with limited capacity
        Queue<String> queue = new ArrayBlockingQueue<>(3);

        System.out.printf("offer one: %s\n", queue.offer("one"));
        System.out.printf("offer two: %s\n", queue.offer("two"));
        System.out.printf("offer three: %s\n", queue.offer("three"));

        // Returns false, but no exception!
        System.out.printf("offer four: %s\n", queue.offer("four"));

        System.out.printf("queue: %s\n", queue);
    }

}
