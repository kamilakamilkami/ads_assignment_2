package DataTypes;
import Lists.MyList;

/**
 *This Java class MyStack represents a stack data structure.
 * It implements the DataType interface and has the following methods:
 * push: Adds an element to the top of the stack.
 * pop: Removes and returns the element from the top of the stack.
 * get: Returns the element from the top of the stack without removing it.
 * size: Returns the number of elements currently in the stack.
 */
public class MyStack<T extends Comparable<T>> implements DataType<T>{
    private final MyList<T> list;

    public MyStack(MyList<T> list) {
        this.list = list;
    }

    public void push(T t) {
        list.addLast(t);
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