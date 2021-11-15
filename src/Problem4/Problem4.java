package Problem4;

public class Problem4 {
    static int[] src;
    static int target;

    /**
     * @param arr a nonnull integer array listed in increasing order
     * @param k the expected sum of the pair of int
     * @return null, if no pair sums k; {int a, int b}, if such pair is found
     */
    public static int[] find(int[] arr, int k){
        src = arr;
        target = k;
        int length = src.length;
        /*
        base case:
                1. smallest sum of src array is bigger than target or
                    biggest sum of src array is smaller than target
        */
        if (length >=2 && (src[0]+src[1] > target || src[length-1] + src[length-2] < target))
            return null;
        return compute(0, length-1);
    }

    private static int[] compute(int i, int j){
        int size = j-i+1;
        /*
        base case:
                2.size < 2 or
                3.sum == target or
                4.size = 2 && sum != target
        */
        if (size < 2 )  return null;

        int sum = src[i] + src[j];
        if( sum == target)  return new int[] {src[i], src[j]};
        if (size ==2)  return null;

        /*
        recursive call ：
                size > 2 && sum != target
        */
        if (sum > target)
            return compute(i, j-1);
        else //sum < target
            return compute(i+1, j);
    }
}
