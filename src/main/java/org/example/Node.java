package org.example;

public class Node {
    private Stage stage;
    private Node next;
    private Node prev;

    public Node() {
    }

    public Node(Stage stage) {
        this.stage = stage;
    }

    public Node(Stage stage, Node next, Node prev) {
        this.stage = stage;
        this.next = next;
        this.prev = prev;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
