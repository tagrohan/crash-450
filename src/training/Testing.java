package training;

import java.lang.reflect.Array;
import java.util.*;

public class Testing {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(findAllIndexesList(new int[]{1, 2, 5, 4, 5, 6, 5, 7}, 5, 0).toArray()));
    }

    private static List<Integer> findAllIndexesList(int[] arr, int toMatch, int index) {
        if (arr.length == index) {
            return new ArrayList<>();
        }

        List<Integer> tempList = findAllIndexesList(arr, toMatch, index + 1);
        if (arr[index] == toMatch) {
            tempList.add(index);
        }
        Collections.reverse(tempList); // just to make it in order
        return tempList;
    }

    // find indexes of all occurrence
    private static int[] findAllIndexes(int[] arr, int toMatch, int index, int foundSoFar) {
//        System.out.println(Arrays.toString(findAllIndexes(new int[]{1, 2, 5, 4, 5, 6, 5, 7}, 5, 0, 0)));
        if (arr.length == index) {
            return new int[foundSoFar];
        }
        if (arr[index] == toMatch) {
            foundSoFar += 1;
        }

        int[] tempIndexes = findAllIndexes(arr, toMatch, index + 1, foundSoFar);
        if (arr[index] == toMatch) {
            tempIndexes[foundSoFar - 1] = index;
        }
        return tempIndexes;
    }

    private static int findFromLast(int[] arr, int toFind, int index) {
//        System.out.println(findFromLast(new int[]{1, 2, 3, 4, 5, 6, 5, 7}, 5, 0));
        if (arr.length == index) return -1;

        int currentIndex = findFromLast(arr, toFind, index + 1);
        if (currentIndex != -1) {
            return currentIndex;
        } else {
            return arr[index] == toFind ? index : -1;
        }
    }

    // find from start
    private static int findFromStart(int[] arr, int toFind, int index) {
//        System.out.println(findFromStart(new int[]{1, 2, 3, 4, 5, 6, 5, 7}, 5, 0));
        if (arr.length - 1 == index) {
            return arr[index] == toFind ? index : -1;
        }
        if (arr[index] == toFind) {
            return index;
        }
        return findFromStart(arr, toFind, index + 1);

    }
}
