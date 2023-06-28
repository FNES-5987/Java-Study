package ch03;

public class LoopWhile {
    public static void main(String[] args) {
        // 2. whlie 문
        /*
       whlie (조건식) {
       조건식이 true인 동안 반복 될 코드
       조건식이 false가 되는 탈출 구문이 필요함
         */
        int i = 0;
        while (i < 5) {
            System.out.println("i의 값 : " + i);
            i++;
        }

        // 3. do-whlie 문
        /*
        do {
        반복하여 실행할 코드
        } while (조건식);
         */
    }
}
