package edu.howardcc.javaii.examples.list;

/**
 * Demonstrate implementation of a linked list
 */
public class HCCLinkedList<T> {

    private HCCListNode<T> head;
    private HCCListNode<T> tail;

    public HCCLinkedList() {
        head = null;
        tail = null;
    }

    /**
     * Add a new element to the front of the list
     */
    public void insertFront(T data) {
        if (head == null) {
            // The list is empty, create a new node that will be both the head and the tail
            head = new HCCListNode<T>(data);
            tail = head;
        }
        else {
            HCCListNode<T> oldHead = head;
            head = new HCCListNode<T>(data);
            head.nextNode = oldHead;
        }
    }

    /**
     * Add a new element to the back of the list
     */
    public void insertBack(T data) {
        if (head == null) {
            // The list is empty, create a new node that will be both the head and the tail
            head = new HCCListNode<T>(data);
            tail = head;
        }
        else {
            HCCListNode<T> oldTail = tail;
            tail = new HCCListNode<T>(data);
            oldTail.nextNode = tail;
        }
    }

    /**
     * Remove the first element from the list and return it
     */
    public T removeFront() {
        if (head == null) {
            // The list is empty
            return null;
        }
        if (head == tail) {
            // Remove the only element
            T data = head.data;
            head = null;
            tail = null;
            return data;
        }
        else {
            T data = head.data;
            head = head.nextNode;
            return data;
        }
    }

    /**
     * Remove the last element from the list and return it
     */
    public T removeBack() {
        if (tail == null) {
            // The list is empty
            return null;
        }
        if (head == tail) {
            // Remove the only element
            T data = tail.data;
            head = null;
            tail = null;
            return data;
        }
        else {
            T data = tail.data;

            // Find the second to last node and make it the new tail
            HCCListNode<T> current = head;
            while (current.nextNode != tail) {
                current = current.nextNode;
            }
            tail = current;
            tail.nextNode = null;

            return data;
        }
    }

    /**
     * Print each element in the list
     */
    public void print() {
        HCCListNode<T> currentNode = head;

        System.out.println("--------------------------------------------------------------------------------");
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.nextNode;
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        
        // Create a new (empty) list
        HCCLinkedList<String> list = new HCCLinkedList<>();

        // Add some vacation spots to the front
        System.out.println("Adding elements to the front of the list.");
        list.insertFront("Miami");
        list.print();
        list.insertFront("Bermuda");
        list.print();
        list.insertFront("Jamaica");
        list.print();

        // Add some vacation spots to the back
        System.out.println("Adding elements to the back of the list.");
        list.insertBack("Ocean City");
        list.print();
        list.insertBack("Hawaii");
        list.print();

        // Remove the first element and print
        String first = list.removeFront();
        System.out.printf("Removed element from front: %s\n", first);
        list.print();

        String last = list.removeBack();
        System.out.printf("Removed element from back: %s\n", last);
        list.print();

    }

}
