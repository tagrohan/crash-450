package arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(sum(1, 4));
    }

    private static int sum(int start, int end) {
        if (start > end) {
            return 0;
        }
        int temp = sum(start + 1, end);
        return temp + start;
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
