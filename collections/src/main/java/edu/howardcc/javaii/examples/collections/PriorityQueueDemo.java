package edu.howardcc.javaii.examples.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Demonstrate priority Queue methods
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {

        // Create and populate queue (note insertion order - alphabetic!)
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Romeo");
        System.out.printf("Queue: %s\n", queue);
        queue.add("Oscar");
        System.out.printf("Queue: %s\n", queue);
        queue.add("Sierra");
        System.out.printf("Queue: %s\n", queue);
        queue.add("India");
        System.out.printf("Queue: %s\n", queue);
        queue.add("Echo");
        System.out.printf("Queue: %s\n", queue);

        // Remove all the elements
        while (!queue.isEmpty()){
            System.out.printf("Remove: %s\n", queue.remove());
            System.out.printf("Queue: %s\n", queue);
        }

    }

}
