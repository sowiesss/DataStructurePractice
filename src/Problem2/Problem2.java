package Problem2;

import java.util.ArrayList;

public class Problem2<E> implements Stack<E>{//queue stack
    private LinkedQueue<E> queue;

    public Problem2(){
        queue = new LinkedQueue<E>();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void push(E e) {
        queue.enqueue(e);
    }

    @Override
    public E top() {
        E e = null;
        if (size() == 1)
            e = queue.first();

        if (size() > 1) {
            LinkedQueue<E> tmp = findLast();
            e = queue.first();
            tmp.enqueue(e);
            queue = tmp;
        }
        return e;
    }

    @Override
    public E pop() {
        E e = null;
        if (size() == 1)
            e = queue.dequeue();

        if (size() > 1) {
            LinkedQueue<E> tmp = findLast();
            e = queue.dequeue();
            queue = tmp;
        }
        return e;
    }

    private LinkedQueue<E> findLast(){
        LinkedQueue<E> tmp = new LinkedQueue<E>();
        while (size() > 1)
        tmp.enqueue(queue.dequeue());
        return tmp;
    }
}
