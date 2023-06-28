package ch02;

public class Compare {
    public static void main(String[] args) {
        // 동등 비교 연산자 (==)
        int a = 5;
        int b = 3;
        boolean result1 = (a == b); // false
        System.out.println(result1);

        // 부등 비교 연산자 (!=)
        // ! = not. != : 같지않다
        boolean result2 = (a != b); // ture
        System.out.println(result2);

//        String st1 = "aa";
//        String st2 = "aa";
//        boolean resultSt1 = (st1 == st2);
//        boolean resultSt2 = (st1 != st2);
//        System.out.println(resultSt1);
//        System.out.println(resultSt2);

//          문자열로 비교연산을 하지 말 것!

        String st3 = new String("aa");
        String st4 = new String("aa");
        boolean resultSt1 = (st3.equals(st4)); // equals는 실제 문자열 비교를 한다.
        boolean resultSt2 = (!st3.equals(st4));
        // 논리적 반대 연산을 할때에는 !를 쓴다.
        // 정확히는 결과값을 반대로 반환하는 것.
        System.out.println(resultSt1);
        System.out.println(resultSt2);

        // 크기 비교 연산자
        boolean result3 = (a > b); // ture(a가 b보다 크다)
        boolean result4 = (a < b);  // false (a가 b보다 작지 않다)
        boolean result5 = (a >= b); // true (a가 b보다 크거나 같다)
        boolean result6 = (a <= b); // false (a가 b보다 작거나 같지 않다)
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
