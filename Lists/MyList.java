package Lists;

import java.util.Iterator;

/**
 * This is the MyList interface,
 * which defines a contract for classes that represent lists of elements.
 */
public interface MyList<T> {
    void add(T item);
    void add(T item, int index);
    void addFirst(T item);
    void addLast(T item);
    void set(T item, int index);
    T get(int index);
    T getFirst();
    T getLast();
    void remove(int index);
    void removeFirst();
    void removeLast();
    void sort();
    int indexOf(T item);
    int lastIndexOf(T item);
    boolean exists(T item);
    T[] toArray();
    void clear();
    int size();

    Iterator<T> iterator();
}