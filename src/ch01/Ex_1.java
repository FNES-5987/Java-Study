package ch01;
import java.util.Scanner;
public class Ex_1 {
    public static void main(String[] args){
        System.out.println("Hello World");
        int x = 5;

        System.out.println(x);
        float pi = 3.14f;

        System.out.println(pi);
        char grade = 'A';

        System.out.println(grade);
        String names = "1,2,3";

        System.out.println(names);
        boolean isTrue = true;

        System.out.println(isTrue);
        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers[0]);

        int num1 = 10;
        int num2 = 20;
        System.out.println(num1+num2);

        float a = 1.2f;
        float b = 3.4f;
        float c = 5.6f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
