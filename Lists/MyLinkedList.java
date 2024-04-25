package Lists;

import java.util.Iterator;

/**
 * @param <T> provides a basic implementation of a singly linked list,
 *supporting various operations commonly associated with lists.
 * It provides methods to add, get, set, remove elements.
 */
public class MyLinkedList<T extends Object & Comparable<T>> implements MyList<T> {
    private int size = 0;
    private Node<T> head;
    private Node<T> tail;

    @Override
    public void add(T item) {
        size++;
        if (head == null) {
            head = new Node<>(item);
            return;
        }
        Node<T> last = getLastNode();
        last.next = new Node<>(item, null);
    }

    @Override
    public void add(T item, int index) {
        checkIndex(index);
        Node<T> node = getNodeAt(index);
        size++;
        if (index == 0) {
            head = new Node<>(item, head);
            return;
        }
        node.next = new Node<>(item, node.next);
    }

    @Override
    public void addFirst(T item) {
        add(item, 0);
    }

    @Override
    public void addLast(T item) {
        add(item);
    }

    @Override
    public void set(T item, int index) {
        Node<T> node = head;
        while (index-- != 0 && node.next != null)
            node = node.next;
        node.item = item;
    }

    @Override
    public T get(int index) {
        return getNodeAt(index + 1).item;
    }

    @Override
    public T getFirst() {
        return head.item;
    }

    @Override
    public T getLast() {
        return getLastNode().item;
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        Node<T> node = getNodeAt(index);
        node.next = node.next.next;
        size--;
    }

    @Override
    public void removeFirst() {
        head = head.next;
        size--;
    }

    @Override
    public void removeLast() {
        Node<T> node = getNodeAt(size - 1);
        node.next = null;
        size--;
    }

    @Override
    public void sort() {
        boolean swapped;
        Node<T> node;

        if (head == null)
            return;

        do {
            swapped = false;
            node = head;

            while (node.next != null) {
                if (node.item.compareTo(node.next.item) > 0) {
                    T t = node.next.item;
                    node.next.item = node.item;
                    node.item = t;
                    swapped = true;
                }
                node = node.next;
            }
        } while (swapped);
    }

    @Override
    public int indexOf(T item) {
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            if (node.item.equals(item))
                return i;
            node = node.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T item) {
        Node<T> node = head;
        int t = -1;
        for (int i = 0; i < size; i++) {
            if (node.item.equals(item))
                t = i;
            node = node.next;
        }
        return t;
    }

    @Override
    public boolean exists(T item) {
        return indexOf(item) != -1;
    }

    @Override
    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            array[i] = node.item;
            node = node.next;
        }
        return array;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<T> h = head;
        while (h != null) {
            str.append(h.item).append(" ");
            h = h.next;
        }
        return str.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }


    private class Itr implements Iterator<T> {
        Node<T> front;

        public Itr() {
            front = head;
        }

        @Override
        public boolean hasNext() {
            return front != null;
        }

        @Override
        public T next() {
            Node<T> node = front;
            front = front.next;
            return node.item;
        }
    }

    private static class Node<T> {
        T item;
        Node<T> next;

        public Node(T item) {
            this.item = item;
            next = null;
        }

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node<T> getNodeAt(int index) {
        checkIndex(index);
        Node<T> node = head;
        if (node == null)
            return null;
        while (--index != 0 && node.next != null)
            node = node.next;
        return node;
    }

    private Node<T> getLastNode() {
        Node<T> node = head;
        while (node.next != null)
            node = node.next;
        return node;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index must be between 0 and " + size);
    }
}