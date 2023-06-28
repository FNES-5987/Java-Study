package ch02;

public class Ex_22 {
    public static void main(String[] args) {
        int number = 1234;
        int result = number - number % 100;
        //           1234 - (1234 % 100 = 34) = 1200
        //         if 123 - (123 % 100 = 23) = 100
        System.out.println(result);
    }
}
