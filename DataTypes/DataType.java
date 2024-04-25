package DataTypes;

import Lists.MyList;

/**
 * This interface abstracts common operations performed on data structures that exhibit stack behavior,
 * such as pushing elements onto the stack, popping elements off the stack, retrieving the top element,
 * and getting the size of the stack.
 */
public interface DataType<E> {
    void push(E e);
    E pop();
    E get();
    int size();
}
