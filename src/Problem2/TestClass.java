package Problem2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestClass {


    @Test
    void test() {
        Problem2<Integer> p = new Problem2<Integer>();
        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(2);
        Integer c = Integer.valueOf(3);
        Integer d = Integer.valueOf(4);

        assertEquals(0, p.size());
        assertTrue(p.isEmpty());

        p.push(a);
        p.push(b);
        p.push(c);
        p.push(d);

        assertEquals(4, p.size());
        assertFalse(p.isEmpty());
        assertEquals(d, p.top());
        assertEquals(d, p.pop());

        assertEquals(3, p.size());
        assertFalse(p.isEmpty());
        assertEquals(c, p.top());
        assertEquals(c, p.pop());

        assertEquals(2, p.size());
        assertFalse(p.isEmpty());
        assertEquals(b, p.top());
        assertEquals(b, p.pop());

        assertEquals(1, p.size());
        assertFalse(p.isEmpty());
        assertEquals(a, p.pop());
        assertNull(p.top());

        assertEquals(0, p.size());
        assertTrue(p.isEmpty());
        assertNull(p.pop());
        assertNull(p.top());
    }

}
