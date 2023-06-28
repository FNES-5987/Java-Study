package ch03;

public class Ex_31 {
    public static void main(String[] args) {
        // 문제 1번
        int x = 11;
        if (x>10) {
            System.out.println("큰 수");
        } else {
            System.out.println("작은 수");
        }

        //문제 2번
        int score = 80;
        if (score >= 80) {
            System.out.println("통과");
        } else {
            System.out.println("불통과");
        }

        //문제 3번
        int num = 1;
        if (num > 0) {
            System.out.println("양수");
        } else if (num == 0) {
            System.out.println("0");
        } else {
            System.out.println("음수");
        }

        //문제 4번
        int age = 20;
        if (age >= 20) {
            System.out.println("성인");
        } else {
            System.out.println("미성녕자");
        }

        //문제 5번
        int mount = 1;
        switch (mount) {
            case 1 :
                System.out.println("1월");
                break;
            case 2 :
                System.out.println("2월");
                break;
            case 3 :
                System.out.println("3월");
                break;
            case 4 :
                System.out.println("4월");
                break;
            case 5 :
                System.out.println("5월");
                break;
            case 6 :
                System.out.println("6월");
                break;
            case 7 :
                System.out.println("7월");
                break;
            case 8 :
                System.out.println("8월");
                break;
            case 9 :
                System.out.println("9월");
                break;
            case 10 :
                System.out.println("10월");
                break;
            case 11 :
                System.out.println("11월");
                break;
            case 12 :
                System.out.println("12월");
                break;
            default:
                System.out.println("유효한 숫자가 아닙니다.");
        }

        //문제 6번
        int year = 2023;
        if (year % 400 == 0) {
            System.out.println("윤년");
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }

        //문제 7번
        int num1 = 5;
        int num2 = 5;
        if (num1 == num2) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }

        //문제 8번
        int a = 0;
        int b = 0;
        int c = 0;
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("양수");
        } else if (a == 0 && b == 0 && c == 0) {
            System.out.println("0");
        } else {
            System.out.println("음수");
        }

        //문제 9번
        int score1 = 55;
        if (score1 >= 90) {
            System.out.println("A");
        } else if (score1 >=80) {
            System.out.println("B");
        } else if (score1 >=70) {
            System.out.println("C");
        } else if (score1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        //문제 10번
        int numx = 15;
        if ((numx % 3 == 0) && (numx % 5 == 0)) {
            System.out.println("3과 5의 배수");
        } else if (numx % 3 == 0) {
            System.out.println("3의 배수");
        } else if (numx % 5 == 0) {
            System.out.println("5의 배수");
        } else {
            System.out.println("해당사항 없음");
        }
    }
}
