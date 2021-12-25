package training;

public class Testing {
    public static void main(String[] args) {

        System.out.println(find(new int[]{1, 2, 3, 4, 5, 6, 5, 7}, 5, 0));
    }

    // find from start
    private static int find(int[] arr, int toFind, int index) {

        if (arr.length - 1 == index) {
            return arr[index] == toFind ? index : -1;
        }
        if (arr[index] == toFind) {
            return index;
        }
        return find(arr, toFind, index + 1);

    }
}
