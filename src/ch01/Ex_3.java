package ch01;

public class Ex_3 {
    public static void main(String[] args){
        // 문제1 정수 -> 문자
        int a = 123;
        String b = String.valueOf(a);
        System.out.println(b);

        // 문제2 실수 -> 문자
        double c = 3.14;
        String d = String.valueOf(c);
        System.out.println(d);

        // 문제3 문자 -> 정수
        String e = "456";
        int f = Integer.valueOf(e);
        System.out.println(f);

        // 문제4 문자 -> 실수
        String g = "2.718";
        double h = Double.valueOf(g);
        System.out.println(h);
    }
}
