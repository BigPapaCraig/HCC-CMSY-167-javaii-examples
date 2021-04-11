package edu.howardcc.javaii.examples.list;

/**
 * Represents a node in a linked list
 */
public class HCCListNode<T> {

    // Default (package private) visibility so List class can access and make changes
    T data;
    HCCListNode<T> nextNode;

    /**
     * Create a node with no other node references
     */
    public HCCListNode(T data) {
        this.data = data;
    }

    /**
     * Create a node with a reference to another ListNode
     */
    public HCCListNode(T data, HCCListNode<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

}
