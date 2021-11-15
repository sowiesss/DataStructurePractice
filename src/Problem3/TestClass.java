package Problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClass {
    @Test
    void test(){
        Problem3<Float> p = new Problem3<Float>();
        Float one = Float.valueOf(1.1f);
        Float two = Float.valueOf(2.2f);
        Float three = Float.valueOf(3.3f);
        Float four = Float.valueOf(4.4f);
        
        
        //test queue methods
        assertEquals(0, p.size());
        assertTrue(p.isEmpty());
        
        p.enqueue(one);
        p.enqueue(two);
        p.enqueue(three);
        p.enqueue(four);

        assertEquals(4, p.size());
        assertFalse(p.isEmpty());
        assertEquals(one, p.first());
        assertEquals(one, p.dequeue());

        assertEquals(3, p.size());
        assertFalse(p.isEmpty());
        assertEquals(two, p.first());
        assertEquals(two, p.dequeue());

        assertEquals(2, p.size());
        assertFalse(p.isEmpty());
        assertEquals(three, p.first());
        assertEquals(three, p.dequeue());

        assertEquals(1, p.size());
        assertFalse(p.isEmpty());
        assertEquals(four, p.first());
        assertEquals(four, p.dequeue());

        assertEquals(0, p.size());
        assertTrue(p.isEmpty());
        assertNull(p.first());
        assertNull(p.dequeue());

        //test stack methods
        p.push(one);
        p.push(two);
        p.push(three);
        p.push(four);

        assertEquals(4, p.size());
        assertFalse(p.isEmpty());
        assertEquals(four, p.top());
        assertEquals(four, p.pop());

        assertEquals(3, p.size());
        assertFalse(p.isEmpty());
        assertEquals(three, p.top());
        assertEquals(three, p.pop());

        assertEquals(2, p.size());
        assertFalse(p.isEmpty());
        assertEquals(two, p.top());
        assertEquals(two, p.pop());

        assertEquals(1, p.size());
        assertFalse(p.isEmpty());
        assertEquals(one, p.top());
        assertEquals(one, p.pop());

        assertEquals(0, p.size());
        assertTrue(p.isEmpty());
        assertNull(p.pop());
        assertNull(p.top());
    }

}