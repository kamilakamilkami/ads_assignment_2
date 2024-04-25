# Algorithms and Data Structures Assignment 2

# 1.Main
# Main class demonstrates the usage of the MyArrayList class,specifically adding elements to the list, removing elements, and retrieving elements by index.

# 2.Lists
# • MyList: MyList interface, which defines a contract for classes that represent lists of elements.
# • MyArrayList: MyArrayList implements the MyList interface using an array as its underlying storage.It provides methods to add, get, set, remove elements, and perform other operations commonly associated with lists.
# • MyLinkedList: MyLinkedList provides a basic implementation of a singly linked list,supporting various operations commonly associated with lists.It provides methods to add, get, set, remove elements.
 
# 3.DataTypes
# • DataType : This interface abstracts common operations performed on data structures that exhibit stack behavior, such as pushing elements onto the stack, popping elements off the stack, retrieving the top element,and getting the size of the stack.
# • MyMinHeap : MyMinHeap provides a basic implementation of a min-heap data structure using a list as its underlying storage. It supports insertion, retrieval, and deletion of elements while maintaining the min-heap property.However, the decrease and delete methods are currently not implemented.
# • MyQueue : MyQueue class provides a convenient interface for working with a queue data structure using any implementation of the MyList interface.It encapsulates the queue operations and delegates the underlying storage to the provided list implementation.
# • MyStack : This Java class MyStack represents a stack data structure. It implements the DataType interface and has the following methods: 

# push: Adds an element to the top of the stack.

# pop: Removes and returns the element from the top of the stack. 

# get: Returns the element from the top of the stack without removing it. 

# size: Returns the number of elements currently in the stack.

# 4.Test
# • MyListTest: This code contains a series of test methods (testAdd, testDelete,testGet, testSet, testIndexOf, testLastIndexOf, testExists) for testing various functionalities of two different implementations of the MyList interface (MyArrayList and MyLinkedList).The testList method orchestrates the execution of these tests for both implementations.
