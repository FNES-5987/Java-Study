package ch03;

public class LoopEx {
    public static void main(String[] args) {

        //도트그래픽 2D (x, y축)

        //반복문을 돌리려면, 가장 바깥 반복문이 행을 제어하는 반복문
        // 1번째행 -> 1번째열..2번째열..... 줄변경
        // 2번째행 -> 1번째열..2번째열..... 줄변경

        for(int i = 1; i <= 5; i++) {
            // 빈공간 출력 -> 별 출력
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i -1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
  }
}
