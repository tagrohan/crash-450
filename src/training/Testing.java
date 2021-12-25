package training;

public class Testing {
    public static void main(String[] args) {

        System.out.println(findFromLast(new int[]{1, 2, 3, 4, 5, 6, 5, 7}, 5, 0));
    }

    private static int findFromLast(int[] arr, int toFind, int index) {
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
