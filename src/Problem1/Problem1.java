package Problem1;

public class Problem1<E> implements Queue<E> {
    private ArrayStack<E> stack;
    private int capacity;

    public Problem1(){
        stack = new ArrayStack<E>();
        capacity = ArrayStack.CAPACITY;
    }

    public Problem1(int c){
        stack = new ArrayStack<E>(c);
        capacity = c;
    }
    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void enqueue(E e) throws IllegalStateException {

        if (size()==capacity){
            throw new IllegalStateException("Queue is full.");
        }
        stack.push(e);


    }

    @Override
    public E first() {
        E re = null;

        if (size() == 1)
            re = stack.top();

        if (size() > 1) {
            Stack<E> tmp = popToFirst();
            re = stack.top();
            while (!tmp.isEmpty())
            stack.push(tmp.pop());
        }

        return re;
    }

    @Override
    public E dequeue() {
        E re = null;
        if (size() == 1)
            re = stack.pop();

        if (size() > 1) {
            Stack<E> tmp = popToFirst();
            re = stack.pop();
            while (!tmp.isEmpty())
            stack.push(tmp.pop());
        }
        return re;
    }

    private Stack<E> popToFirst() {
        Stack<E> tmp = new ArrayStack<E>(capacity);
        while (stack.size() > 1) {
            tmp.push(stack.pop());//push data[t] to data[1]
        }
        return tmp;
    }
}
