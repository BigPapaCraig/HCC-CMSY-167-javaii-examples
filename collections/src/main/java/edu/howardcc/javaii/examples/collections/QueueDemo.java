package edu.howardcc.javaii.examples.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Demonstrate basic Queue methods
 */
public class QueueDemo {

    public static void main(String[] args) {

        // Create and populate queue
        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        System.out.printf("Queue: %s\n", queue);
        queue.offer("Two");
        System.out.printf("Queue: %s\n", queue);
        queue.add("Three");
        System.out.printf("Queue: %s\n", queue);
        queue.offer("Four");
        System.out.printf("Queue: %s\n", queue);

        // Peek/Element (read front of queue but don't remove anything)
        System.out.printf("Peek: %s\n", queue.peek());
        System.out.printf("Element: %s\n", queue.peek());
        System.out.printf("Queue: %s\n", queue);

        // Remove/Poll (read and remove from front of queue)
        System.out.printf("Remove: %s\n", queue.remove());
        System.out.printf("Poll: %s\n", queue.poll());
        System.out.printf("Queue: %s\n", queue);


    }

}
