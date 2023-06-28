package ch04;

import java.util.Scanner;

public class Ex_4_1 {
    public static void main(String[] args) {
        // 문제 1번
//        int[] index = new int[5];
//        index[2] = 7;
//        System.out.println(index[2]);
//
//        // 문제 2번
//        String[] index1 = new String[3];
//        index1[0] = "Java";
//        index1[1] = "Pyhton";
//        index1[2] = "C++";
//        System.out.println(index1[0]);
//        System.out.println(index1[1]);
//        System.out.println(index1[2]);

        // 문제 3번
//        double[] index2 = new double[4];
//        System.out.println("실수를 입력하세요");
//        Scanner scanner = new Scanner(System.in);
//        double inputDouble = scanner.nextDouble();
//        System.out.println(inputDouble);

        // 문제 4번
//        int[] index3 = new int[7];
//        for (int i = 0; i < index3.length; i++) {
//            System.out.println(i+1);
//    }

        //문제 5번 스킵

        //문제 6번
//        int[] index4 = {0, 0, 0, 0, 0};
//        System.out.println(index4[0]);
//        System.out.println(index4[1]);
//        System.out.println(index4[2]);
//        System.out.println(index4[3]);
//        System.out.println(index4[4]);

        //문제 7번
//        int[] index7 = new int[4];
//        for (int i = 0; i < index7.length; i++) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println((i + 1) + "번째 숫자를 입력하시오");
//            int inputNum = scanner.nextInt();
//            index7[i] = inputNum;
//        }
//        int plus = index7[0] + index7[1] + index7[2] + index7[3] ;
//        System.out.println("모든 숫자의 합은 : " + plus);

        //문제 8번
//        int[] index = new int[5];
//        int max = 0;
//        int low = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i + 1 + "번째 정수를 입력하세요");
//            Scanner scanner = new Scanner(System.in);
//            int inPut = scanner.nextInt();
//            }

        //문제 9번
        String [] names = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("이름을 입력하세요 : ");
            names[i] = scanner.nextLine();
        }
        scanner.close();
        }
    }
