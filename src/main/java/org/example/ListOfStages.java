package org.example;

public class ListOfStages implements ProgramOfStages {
    private DoublyLinkedList list = new DoublyLinkedList();

    public void add(Node node) {
        list.add(node);
    }

    public Stage next() {
        return list.next();
    }

    public Stage prev() {
        return list.prev();
    }

    public Stage curr() {
        return list.curr();
    }

    public void toNext() {
        list.toNext();
    }

    public void toPrev() {
        list.toPrev();
    }
}
