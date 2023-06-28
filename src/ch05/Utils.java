package ch05;

public class Utils {
    public static void main(String[] args) {
        Re_Ex_5_1 utils = new Re_Ex_5_1();
        // 메서드 호출
        int a = 10;
        int b = 5;
        int result = utils.sum(a, b);
        int result2 = utils.sum(3, 5);

        int[] arr = {1,2,3,4,5,6};
        int resultSum = utils.sumArr(arr);
        System.out.println(resultSum);
    }
}
