package linkedlist;

import node.Node;

public class LinkedList {

    private int size;
    private Node start;

    public LinkedList() {
        this.size = 0;
        this.start = null;
    }

    public void insertAtFirst(int value) {
        Node n = new Node();
        n.setData(value);
        n.setNext(start);
        start = n;
        size++;
    }

    public void insertAtLast(int value) {
        Node n = new Node();
        Node t;
        t = start;
        n.setData(value);
        if (t == null) {
            start = n;
        } else {
            while (t.getNext() != null) {
                t = t.getNext();
            }
            t.setNext(n);
        }
        size++;
    }

    public void insertAtPosition(int value, int position) {
        if (position == 1) {
            insertAtFirst(value);
        } else if (position == size + 1) {
            insertAtLast(value);
        } else if (position > 1 && position <= size) {
            Node n = new Node();
            Node t;
            t = start;
            n.setData(value);
            for (int i = 1; i < position - 1; i++) {
                t = t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        } else {
            System.out.println("insertion is not possible");
        }
    }

    public void deleteFirst() {
        if (start == null) {
            System.out.println("list is already empty");
        } else {
            start = start.getNext();
            size--;
        }
    }

    public void deleteLast() {
        if (start == null) {
            System.out.println("list is already empty");
        } else if (size == 1) {
            start = null;
            size--;
        } else {
            Node t;
            t = start;
            for (int i = 1; i < size - 1; i++) {
                t = t.getNext();
            }
            t.setNext(null);
            size--;
        }
    }

    public void deleteAtPosition(int position) {
        if (start == null) {
            System.out.println("lost is already empty");
        } else if (position < 1 || position > size) {
            System.out.println("invalid position");
        } else if (position == 1) {
            deleteFirst();
        } else if (position == size) {
            deleteLast();
        } else {
            Node t, t1;
            t = start;
            for (int i = 1; i < position - 1; i++) {
                t = t.getNext();
            }
            t1 = t.getNext();
            t.setNext(t1.getNext());
            size--;
        }
    }

    public void numberOfElements() {
        System.out.println(size);
    }

    public void IsEmpty() {
        if (start == null) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void showData() {
        Node t;
        t = start;
        if (t == null) {
            System.out.println("list is empty");
        } else {
            for (int i = 1; i <= size; i++) {
                System.out.println(t.getData());
                t = t.getNext();
            }
        }
    }
}
