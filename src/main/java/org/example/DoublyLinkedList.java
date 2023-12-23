package org.example;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private Node current;

    public void add(Node node) {
        if (head == null) {
            head = node;
            tail = head;
            current = head;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = tail.getNext();
        }
    }

    public void toNext() {
        if (current != null) {
            current = current.getNext();
        }
    }

    public void toPrev() {
        if (current != null) {
            current = current.getPrev();
        }
    }

    public Stage next() {
        if (current != null) {
            return current.getNext().getStage();
        }
        return null;
    }

    public Stage prev() {
        if (current != null) {
            return current.getPrev().getStage();
        }
        return null;
    }

    public Stage curr() {
        if (current != null) {
            return current.getStage();
        }
        return null;
    }
}
