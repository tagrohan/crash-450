package arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        System.out.println(isPalindrome("malayalam", 0));
    }

    private static boolean isPalindrome(String str, int index) {
//        System.out.println(isPalindrome("malayalam", 0));
        if (str.length() / 2 == index) return true;
        if (str.charAt(index) != str.charAt(str.length() - index - 1)) return false;
        return isPalindrome(str, index + 1);
    }

    private static int[] rev(int[] arr, int index) { // 1 2 3 4 5
//        System.out.println(Arrays.toString(rev(new int[]{1, 2, 3, 4, 5}, 0)));
        if (arr.length / 2 <= index) {               //  2 <= 0
            return arr;
        }
        swap(arr, index, arr.length);
        return rev(arr, index + 1);

    }

    private static void swap(int[] arr, int from, int to) {
        int start = arr[from];                 // start = 1
        arr[from] = arr[to - from - 1];  // arr[0] = arr[4]
        arr[to - from - 1] = start;
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
