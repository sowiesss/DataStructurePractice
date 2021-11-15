package Problem3;

/**

 * Interface for a double - ended queue ; this interface

 * is a simplified version of java . util . Deque .

 */

public interface Deque <E> {

    int size (); // Returns the number of elements in the deque .

    boolean isEmpty (); // Tests whether the deque is empty .

    E first (); // Returns ( but not remove ) the first element of the deque .

    E last (); // Returns (but not remove ) the last element of the deque .


    void addFirst (E e); // Inserts an element at the front of the deque .


    void addLast (E e); // Inserts an element at the back of the deque .


    E removeFirst (); // Removes and returns the first element of the deque .


    E removeLast (); // Removes and returns the last element of the deque .


}