package ch02;

public class TernaryOperater {
    public static void main(String[] args) {
        // 3항 연산 = 항이 3개인 연산식
        // 1항 연산 : ++a
        // 2항 연산 : a + b
        // 3항 연산의 구조 : 조건식 ? 값1 : 값2
        // 조건식은 true 또는 false 를 반환할 수 있는 식만 온다.
        int num1 = 10;
        int num2 = 5;
        int max = (num1 > num2) ? num1 : num2;
        // 조건식의 값이 true면 ? 뒤의 값을 반환
        // false 라면 :의 뒤의 값을 반환
        // 지금의 식에서는 true 이기에 ? 뒤에 있는 num1을 출력
        System.out.println("더 큰 숫자는 : " + max);
    }
}
