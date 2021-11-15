package Problem3;
/* ListDeque */
public class Problem3<E> extends ListDeque<E> implements Stack<E>, Queue<E> {
    //default constructor, initialize a ListDeque<E> instance encapsulated in a Problem3 instance

    // size(), isEmpty(), first() are inherited from ListDeque<E>

    //take first node of the list as the front of the queue and last node as the end of queue
    @Override
    public void enqueue(E e) {
        addLast(e);
    }

    @Override
    public E dequeue() {
        return removeFirst();
    }

    // use the last node of the list as the top of stack
    @Override
    public void push(E e) {
        addLast(e);
    }

    @Override
    public E top() {
        return last();
    }

    @Override
    public E pop() {
        return removeLast();
    }
}
