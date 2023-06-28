package ch03;

public class Ex_32 {
    public static void main(String[] args) {
        //문제 1번
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //문제 2번
        for (int count = 0; count <= 100; count++) {
            if (count % 2 != 0) {
                System.out.println(count);
            }
        }

        //문제 3번
        for (int gop = 0; gop <= 45; gop++) {
            if (gop % 5 == 0) {
                System.out.println(gop);
            }
        }

        //문제 4번
        for (int dis = 10; dis > 0; dis--) {
            System.out.println(dis);
        }

        //문제 5번
        int hap = 0;
        for (int three = 0; three <= 100; three++) {
            if (three % 3 == 0) {
                hap = hap + three;
            }
        }
        System.out.println(hap);

        //문제 6번
        for (int tf = 0; tf <= 100; tf++) {
            if ((tf % 3 == 0) || (tf % 5 == 0)) {
                System.out.println(tf);
            }
        }

        //문제 7번 제외

        //문제 8번
        for (int gu = 10; gu >= 0; gu--) {
            System.out.println(gu);
        }

        //문제 9번
        for (int seven = 63; seven >1; seven--) {
            if (seven % 7 == 0) {
                System.out.println(seven);
            }
        }

        //문제 10번
        for (int a = 1; a <= 5; a++) {
            for (int blank = 1; blank <= 5-a; blank++) {
                System.out.print(" ");
            } for (int star = 1; star <= a; star++) {
                System.out.print("*");
            }
            System.out.println("-");
        }
    }
}
