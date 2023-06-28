package ch05;

public class Re_Ex_5_1 {
    public int sum(int a,int b) {
        int value = a + b;
        System.out.println("결과는 " + value + "입니다.");
        return value;
    }

    public int sumArr(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }
}
