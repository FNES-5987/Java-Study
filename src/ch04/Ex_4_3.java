package ch04;

public class Ex_4_3 {
    public static void main(String[] args) {
//        //문제 1번
        int[] numbers = {1,2,3,4,5};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println("배열의 합 : " + sum);

        //문제 2번
        int[] numbers1 = {7, 14, 3, 8, 21, 5};
        int max = numbers1[0];

        for (int number : numbers1) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("최댓값 : " + max);
    }
}
