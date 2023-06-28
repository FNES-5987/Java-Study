package ch05;

public class Method {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int findMax(int c, int d) {
        if (c > d) {
            return c;
        } else
            return d;
    }

    public static int hap(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static String word(String[] arr) {
        String longest = "";
        for (String  str : arr) {
            longest = str;
        }
        return longest;
    }

    public static int zak(int[] arr) {
        int num = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                num++;
            }
        }
        return num;
    }
}