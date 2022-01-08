package arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(rev(new int[]{1,2,2}, 0)));
    }


    private static int[] rev(int[] arr, int index) { // 1 2 3 4 5
//        System.out.println(Arrays.toString(rev(new int[]{1,2,2}, 0)));
        if (arr.length / 2 <= index) {               //  2 <= 0
            return arr;
        }
        // swap here
        int start = arr[index];                 // start = 1
        arr[index] = arr[arr.length - index - 1];  // arr[0] = arr[4]
        arr[arr.length - index - 1] = start;      // arr[4] = start

        return rev(arr, index + 1);

    }

    private static int sum(int start, int end) {
//        System.out.println(sum(1, 4));
        if (start > end) {
            return 0;
        }

        return start + sum(start + 1, end);
    }


    private static void print1ToN(int start, int end) {
//        print1ToN(1, 5);
        if (start > end) return;

        System.out.println(start);
        print1ToN(start + 1, end);
    }


    private static int factorial(int num) {
        if (num <= 0) return 1;
        return num * factorial(num - 1);
    }
}
