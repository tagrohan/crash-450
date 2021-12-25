package arrays;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        reverseArray(new int[]{1,2,3,4,5,6,1,1,-1,-2});
    }

    private static void reverseArray(int[] arr) {
        int[] revArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - 1 - i];
            revArr[revArr.length - 1 - i] = arr[i];
        }
        System.out.println(Arrays.toString(revArr));
    }
}
