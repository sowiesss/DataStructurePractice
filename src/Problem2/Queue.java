package Problem2;

interface Queue <E> {
    int size (); // Returns the number of elements in the queue .
    boolean isEmpty (); // Tests whether the queue is empty .
    void enqueue (E e); // Inserts an element at the rear of the queue .
    E first (); // Returns , but does not remove , the first element of the queue .
    E dequeue (); // Removes and returns the first element of the queue .
}
