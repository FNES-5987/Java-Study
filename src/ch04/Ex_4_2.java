package ch04;

import java.util.Scanner;

public class Ex_4_2 {
    public static void main(String[] args) {
        int matrix1[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                int inPut = scanner.nextInt();
                System.out.println(i + 1 + "," + j + "= " + inPut);
            }
            System.out.println();
        }
    }
}
