package Problem4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestClass {
    @Test
    void test1(){
        int[] a = new int[] {0, 2, 5, 7, 10, 11, 13};
        //reach base case 3: sum == target
        int[] result = Problem4.find(a, 12);
        assertArrayEquals(new int[]{2, 10}, result);
    }
    @Test
    void test2(){
        int[] a = new int[] {0, 2, 5, 7, 10, 11, 13};
        //reach base case 4: size == 2 && sum != target
        int[] result = Problem4.find(a, 8);
        assertArrayEquals(null, result);
    }

    @Test
    void test3(){
        int[] a = new int[] {0, 2, 5, 7, 10, 11, 13};
        //base case 1:
        int[] result1 = Problem4.find(a, 1);
        assertArrayEquals(null, result1);
        int[] result2 = Problem4.find(a, 30);
        assertArrayEquals(null, result2);
    }

    @Test
    void test4(){
        int[] a = new int[] {0};
        //base case 2:
        int[] result1 = Problem4.find(a, 1);
        assertArrayEquals(null, result1);
    }

    @Test
    void test5(){
        int[] a = new int[] {-50, -3, -1, 0, 1, 25, 90, 188};
        int[] result1 = Problem4.find(a, 1);
        assertArrayEquals(new int[]{0,1}, result1);
    }

    @Test
    void test6(){
        int[] a = new int[] {-50, -3, -1, 0, 1, 25, 90, 188};
        int[] result1 = Problem4.find(a, 138);
        assertArrayEquals(new int[]{-50,188}, result1);
    }

    @Test
    void test7(){
        int[] a = new int[] {0,1};
        int[] result1 = Problem4.find(a, 138);
        assertArrayEquals(null, result1);
    }
}
