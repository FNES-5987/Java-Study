package ch03;

public class Loop {
    public static void main(String[] args) {
        // 반복문(Loop) = 특정 조건이 true인 동안 반복하여 실행하는 코드

        // 1. for 문
        /*
        * for (초기화; 조건식; 증감식) {
        * 반복하여 실행 할 코드
        * }
         */
        // 1. 처음 시작시 초기화 식이 실행 int i = 0
        // 2. 조건식을 실행 i < 5
        // 3. 조건식에 부합될때까지 블록 안의 코드 반복 실행 sout~
        // 4. 증감식 실행 i++
        // 이후에는 초기화식은 실행안함.
        // 반복 : 조건식 -> 블록 코드 -> 증감식
        // 반복 하는 중 조건식에 false가 된다면 반복문을 종료
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("i의 값 : " + i);
        }
    }
}
