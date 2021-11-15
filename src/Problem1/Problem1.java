package Problem1;

public class Problem1<E> extends ArrayStack<E> implements Queue<E> {
    private int capacity;

    public Problem1(){
        super();
        capacity = super.CAPACITY;
    }

    public Problem1(int c){
        super(c);
        capacity = c;
    }

    // size(), isEmpty are inherited from ArrayStack

    @Override
    public void enqueue(E e) throws IllegalStateException {

        if (size()==capacity){
            throw new IllegalStateException("Queue is full.");
        }
        push(e);


    }

    @Override
    public E first() {
        E re = null;

        if (size() == 1)
            re = top();

        if (size() > 1) {
            Stack<E> tmp = popToFirst();
            re = top();
            while (!tmp.isEmpty())
            push(tmp.pop());
        }

        return re;
    }

    @Override
    public E dequeue() {
        E re = null;
        if (size() == 1)
            re = pop();

        if (size() > 1) {
            Stack<E> tmp = popToFirst();
            re = pop();
            while (!tmp.isEmpty())
            push(tmp.pop());
        }
        return re;
    }

    private Stack<E> popToFirst() {
        Stack<E> tmp = new ArrayStack<E>(capacity);
        while (size() > 1) {
            tmp.push(pop());//push data[t] to data[1] onto tmp
        }
        return tmp;
    }
}
