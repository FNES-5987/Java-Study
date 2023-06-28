package ch02;

import java.util.Scanner;

public class Ex_23 {
    public static void main(String[] args) {
        System.out.println("금액을 입력하시오.");
        Scanner scanner = new Scanner(System.in);
        String strPrice = scanner.nextLine();
        int price = Integer.valueOf(strPrice);
        int oman = price / 50000;
        int ilman = price % 50000 / 10000;
        int ochun = price % 10000 / 5000;
        int ilchun = price % 5000 / 1000;

        System.out.println("오만원권 :" + oman + "장");
        System.out.println("일만원권 :" + ilman + "장");
        System.out.println("오천원권 :" + ochun + "장");
        System.out.println("일천원권 :" + ilchun + "장");
    }
}
