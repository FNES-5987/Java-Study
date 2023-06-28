package ch04;

import java.util.Scanner;

public class Array_Ex {
    public static void main(String[] args) {
        // 자바 콘솔창에서 키보드입력을 받을때 스캐너를 초기화
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수값을 입력하세요 : ");
        // 정수 값 1개를 입력 받을 수 있음
        int inputNum = scanner.nextInt();
        System.out.println("입력받은 숫자 : " + inputNum);
    }
}
