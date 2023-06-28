package ch04;

public class Matrix {
    public static void main(String[] args) {
        // 2차원 배열 초기화
        // 앞[]은 행, 뒷[]는 열
        int[][] matrix = new int[5][3];
        matrix[0][0] = 1;
        matrix[2][3] = 4;

        //행단위 반복문
        for (int i = 0; i < 5; i++) {

            //열단위 반복문
            for (int j = 0; j < 3; j++) {
                //1행 1열 ~ 5행 3열까지
                matrix[i][j] = i + j;
            }
        }
    }
}
