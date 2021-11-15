package Problem1;

public class TestClass {

    public static void main(String[] args) {
        Problem1<String> s = new Problem1<String>(5);
        System.out.println("Size: "+s.size());
        System.out.println("Empty? "+s.isEmpty());
        System.out.println("");

        s.enqueue("one");
        s.enqueue("two");
        s.enqueue("three");
        s.enqueue("four");
        s.enqueue("five");

        for (int i = 0; i<=5; i++){
            System.out.println("Size: "+s.size());
            System.out.println("Empty? "+s.isEmpty());
            System.out.println("First: "+s.first());
            System.out.println("Dequeue: "+s.dequeue());
            System.out.println("");
        }



        //test enqueue when the queue is full
        s.enqueue("one");
        s.enqueue("two");
        s.enqueue("three");
        s.enqueue("four");
        s.enqueue("five");
        s.enqueue("oops");
    }

}
