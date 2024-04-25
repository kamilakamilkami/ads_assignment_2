package DataTypes;

import Lists.MyList;

/**
 * MyQueue class provides a convenient interface for working with a queue data structure using any implementation of the MyList interface.
 * It encapsulates the queue operations and delegates the underlying storage to the provided list implementation.
 */
public class MyQueue<T extends Comparable<T>> implements DataType<T> {
    private final MyList<T> list;

    public MyQueue(MyList<T> list) {
        this.list = list;
    }

    public void push(T t) {
        list.addFirst(t);
    }

    public T pop() {
        T t = list.getLast();
        list.removeLast();
        return t;
    }

    public T get() {
        return list.getLast();
    }

    public int size() {
        return list.size();
    }
}